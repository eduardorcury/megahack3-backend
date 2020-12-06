package time43.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import time43.domain.Pub;
import time43.mappers.PubMapper;
import time43.model.PubDTO;
import time43.repository.PubRepository;

import java.util.Optional;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(PubController.class)
class PubControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    PubRepository pubRepository;

    @MockBean
    PubMapper pubMapper;

    PubDTO validDTO;
    PubDTO invalidDTO;
    Pub validPub;

    @BeforeEach
    void setUp() {
        validDTO = new PubDTO(null, "Bar", "1212", "671212", "comentário");
        invalidDTO = new PubDTO(null, "", "", "", "comentário");
        validPub = new Pub(null, "Bar", "1212", "671212", "comentário");
    }

    @Test
    void showFormForRegisteringPub() throws Exception {
        mockMvc.perform(get("/novo-bar"))
                .andExpect(status().isOk())
                .andExpect(view().name("pub/register-pub"))
                .andExpect(model().attributeExists("pub"));
    }

    @Test
    void registerNewPubWithValidData() throws Exception {

        when(pubMapper.toDomain(validDTO)).thenReturn(validPub);
        when(pubRepository.save(validPub))
                .thenReturn(new Pub(1L, "Bar", "1212", "671212", "comentário"));

        mockMvc.perform(post("/novo-bar")
                        .param("name", validDTO.getName())
                        .param("cep", validDTO.getCep())
                        .param("telephone", validDTO.getTelephone())
                        .param("comment", validDTO.getComment()))
                .andExpect(status().is3xxRedirection());
    }

    @Test
    void registerNewPubWithInvalidData() throws Exception {

        mockMvc.perform(post("/novo-bar")
                    .param("name", invalidDTO.getName())
                    .param("cep", invalidDTO.getCep())
                    .param("telephone", invalidDTO.getTelephone())
                    .param("comment", invalidDTO.getComment()))
                .andExpect(model().attributeHasFieldErrors("pubDTO", "name"))
                .andExpect(model().attributeHasFieldErrors("pubDTO", "cep"))
                .andExpect(model().attributeHasFieldErrors("pubDTO", "telephone"))
                .andExpect(view().name("pub/register-pub"));
    }

    @Test
    void showPubHomePage() throws Exception {

        when(pubRepository.findById(1L)).thenReturn(Optional.of(validPub));

        mockMvc.perform(get("/bar/1"))
                .andExpect(view().name("pub/pub"))
                .andExpect(model().attributeExists("pub"));
    }

}
package time43.controller;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import time43.domain.User;
import time43.mappers.UserMapper;
import time43.model.UserDTO;
import time43.repository.UserRepository;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(UserController.class)
class UserControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    @MockBean
    UserRepository userRepository;

    @MockBean
    UserMapper userMapper;

    UserDTO validDTO;
    UserDTO invalidDTO;

    User validUser;

    @BeforeEach
    void setup() {
        validDTO = new UserDTO(null, "eduardo", "eduardo@gmail.com", "teste");
        validUser = new User(null, "eduardo", "eduardo@gmail.com", "teste");
        invalidDTO = new UserDTO(null, "", "", "ab");
    }

    @Test
    void showFormForRegisteringUser() throws Exception {
        mockMvc.perform(get("/novo-usuario"))
                .andExpect(status().isOk())
                .andExpect(view().name("user/register-user"));
    }

    @Test
    void registerNewUserWithValidData() throws Exception {

        when(userMapper.toDomain(validDTO)).thenReturn(validUser);
        when(userRepository.save(validUser))
                .thenReturn(new User(1l, "eduardo", "eduardo@gmail.com", "teste"));

        mockMvc.perform(post("/novo-usuario")
                    .param("username", validDTO.getUsername())
                    .param("email", validDTO.getEmail())
                    .param("password", validDTO.getPassword()))
                .andExpect(status().is3xxRedirection());
    }

    @Test
    void registerUserWithInvalidData() throws Exception {

        mockMvc.perform(post("/novo-usuario")
                    .param("username", invalidDTO.getUsername())
                    .param("email", invalidDTO.getEmail())
                    .param("password", invalidDTO.getPassword()))
                .andExpect(model().attributeHasFieldErrors("userDTO", "username"))
                .andExpect(model().attributeHasFieldErrors("userDTO", "email"))
                .andExpect(model().attributeHasFieldErrors("userDTO", "password"))
                .andExpect(view().name("user/register-user"));
    }

}
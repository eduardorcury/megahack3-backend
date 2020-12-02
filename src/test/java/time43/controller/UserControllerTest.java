package time43.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
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

    UserDTO validUser;
    UserDTO invalidUser;

    @BeforeEach
    void setup() {
        validUser = new UserDTO(null, "eduardo", "eduardo@gmail.com", "senha");
        invalidUser = new UserDTO(null, "", "", "ab");
    }

    @Test
    void showFormForRegisteringUser() throws Exception {
        mockMvc.perform(get("/novo-usuario"))
                .andExpect(status().isOk())
                .andExpect(view().name("user/register-user"));
    }

    @Test
    void registerNewUserWithValidData() throws Exception {

        //User user = userMapper.toDomain(validUser);
        //user.setId(1L);

        //when(userMapper.toDomain(validUser)).thenReturn(user);
        //when(userRepository.save(user)).thenReturn(user);

        //TODO CORRIGIR
        mockMvc.perform(post("/novo-usuario")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(validUser)))
                .andExpect(status().isCreated())
                .andExpect(view().name("/user/1"));
    }

}
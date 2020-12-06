package time43.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;
import time43.config.SecurityConfig;
import time43.model.CredentialsDTO;
import time43.model.UserDTO;
import time43.utils.User;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(ApplicationController.class)
@ComponentScan(basePackages = { "time43.config" })
class ApplicationControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper mapper;

    @Test
    void frontPageShouldReturnFrontPageView() throws Exception {
        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(view().name("front-page"));
    }

    @Test
    void pathIdentificacaoShouldReturnIdentificationView() throws Exception {
        mockMvc.perform(get("/identificacao"))
                .andExpect(status().isOk())
                .andExpect(view().name("identification"));
    }

//    @Test
//    void loginWithValidUserShouldReturnStatusOK() throws Exception {
//
//        PasswordEncoder encoder = new BCryptPasswordEncoder();
//        String senha = encoder.encode("teste");
//
//        CredentialsDTO credentialsDTO = new CredentialsDTO("eduardo", senha);
//        System.out.println(mapper.writeValueAsString(credentialsDTO));
//
//        mockMvc.perform(post("/login")
//                .contentType(MediaType.APPLICATION_JSON)
//                .content(mapper.writeValueAsString(credentialsDTO)))
//                .andExpect(status().isOk());
//    }
}
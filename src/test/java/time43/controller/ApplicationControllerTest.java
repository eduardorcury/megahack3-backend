package time43.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;
import time43.utils.User;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(ApplicationController.class)
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

    @Test
    void loginWithValidUserShouldReturnStatusOK() throws Exception {

        User user = new User("eduardo", "teste");

        mockMvc.perform(post("/login")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{ name: 'Eduardo' }")
                .andExpect(status().isOk());
    }

}
package time43.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(ApplicationController.class)
class ApplicationControllerTest {

    @Autowired
    MockMvc mockMvc;

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

}
package com.greenfox.workshop.models;

import static org.hamcrest.Matchers.is;

import com.greenfox.workshop.WorkshopApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class IntegrationTest {
    @Autowired
    MockMvc mockMvc;

    @Test
    public void doUntilSum() throws Exception {
        mockMvc.perform(post("/dountil/sum").content("{\"until\" : 5}")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.result", is(15)));
    }
    @Test
    public void doUntilFactor() throws Exception{
        mockMvc.perform(post("/dountil/factor").content("{\"until\":6}")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.result",is(720)));

    }
    @Test
    public void arraySum() throws Exception{
        mockMvc.perform(post("/arrays")
                .content("{\"what\":\"sum\",\"numbers\":[1,2,3,4]}")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.result",is(10)));
    }
}
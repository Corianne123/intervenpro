package com.intervenpro.tenant.tenant.web.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;


import com.intervenpro.tenant.tenant.web.dto.TenantResponse;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@WebMvcTest(TenantController.class)
public class TenantControllerTest {

    private final TenantController controller =new TenantController();

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldReturnDemoTenant() {
        TenantResponse response = controller.getDemoTenant();

        assertNotNull(response.id());
        assertEquals("IntervenPro Demo",response.name());
        assertEquals("FR", response.countryCode());
        assertEquals("EUR", response.defaultCurrency());
        assertEquals("ACTIVE", response.status());
    }

    
    @Test
    void shouldReturnStaticJson() throws Exception {
        
        mockMvc.perform(get("/api/v1/tenants/demo"))
            .andExpect(status().isOk())
            .andExpect(content()
                .contentTypeCompatibleWith(
                    MediaType.APPLICATION_JSON))
            .andExpect(jsonPath("$.name")
                .value("IntervenPro Demo"))
            .andExpect(jsonPath("$.countryCode")
                .value("FR"))
            .andExpect(jsonPath("$.id")
                .isString());
    }
}

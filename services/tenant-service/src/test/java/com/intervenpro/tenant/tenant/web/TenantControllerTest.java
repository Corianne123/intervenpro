package com.intervenpro.tenant.tenant.web;

import org.junit.jupiter.api.Test;

import com.intervenpro.tenant.tenant.infrastructure.dto.TenantResponse;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
public class TenantControllerTest {

    private final TenantController controller =new TenantController();

    @Test
    void shouldReturnDemoTenant() {
        TenantResponse response = controller.getDemoTenant();

        assertNotNull(response.id());
        assertEquals("IntervenPro Demo",response.name());
        assertEquals("FR", response.countryCode());
        assertEquals("EUR", response.defaultCurrency());
        assertEquals("ACTIVE", response.status());
    }
}

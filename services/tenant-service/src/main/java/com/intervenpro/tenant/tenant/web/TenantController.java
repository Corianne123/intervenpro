package com.intervenpro.tenant.tenant.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intervenpro.tenant.tenant.infrastructure.dto.TenantResponse;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/tenants")
public class TenantController {
    
    @GetMapping("/demo")
    public TenantResponse getDemoTenant() {
        return new TenantResponse(
            UUID.fromString(
                "11111111-1111-4111-8111-111111111111"
            ),
            "IntervenPro Demo",
            "FR",
            "EUR",
            "Europe/Paris",
            "ACTIVE"
        );
    }
}

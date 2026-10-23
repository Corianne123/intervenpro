package com.intervenpro.tenant.tenant.web.dto;

import java.util.UUID;

/*This record will represent an API response */

public record TenantResponse(
    UUID id,
    String name,
    String countryCode,
    String defaultCurrency,
    String timezone,
    String status
) {
}

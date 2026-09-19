package com.fixitnow.DTO.Requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class CreateMaintenanceRequest {
    @NotBlank
    private String title;

    @NotBlank
    private String description;

    @NotNull
    private Long userId;
    @NotNull
    private Long unitId;

    public CreateMaintenanceRequest() {
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Long getUserId() {
        return userId;
    }

    public Long getUnitId() {
        return unitId;
    }
}

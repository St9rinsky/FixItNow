package com.fixitnow.DTO.Requests;

public class CreateMaintenanceRequest {
    private String title;
    private String description;
    private Long userId;
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

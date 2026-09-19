package com.fixitnow.DTO.Response;

import com.fixitnow.Domain.MaintenanceRequest;
import com.fixitnow.Domain.Priority;
import com.fixitnow.Domain.Status;

import java.time.LocalDateTime;

public class MaintenanceRequestResponse {
    private Long id;
    private String title;
    private String description;
    private Status status;
    private Priority priority;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public MaintenanceRequestResponse(MaintenanceRequest request) {
        this.id = request.getId();
        this.title = request.getTitle();
        this.description = request.getDescription();
        this.status = request.getStatus();
        this.priority = request.getPriority();
        this.createdAt = request.getCreatedAt();
        this.updatedAt = request.getUpdatedAt();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Status getStatus() {
        return status;
    }

    public Priority getPriority() {
        return priority;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }
}

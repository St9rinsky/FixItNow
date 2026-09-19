package com.fixitnow.DTO.Requests;

import com.fixitnow.Domain.Priority;
import com.fixitnow.Domain.Status;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class UpdateMaintenanceRequest {
    @NotBlank
    private String description;
    @NotNull
    private Status status;
    @NotNull
    private Priority priority;

    public UpdateMaintenanceRequest() {
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

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }
}

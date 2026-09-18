package com.fixitnow.DTO.Requests;

import com.fixitnow.Domain.Priority;
import com.fixitnow.Domain.Status;

public class UpdateMaintenanceRequest {
    private String description;
    private Status status;
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

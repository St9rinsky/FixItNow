package com.fixitnow.Domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class MaintenanceRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @ManyToOne
    private Unit unit;

    @ManyToOne
    private User createdBy;

    @Enumerated(EnumType.STRING)
    private Status status;

    @Enumerated(EnumType.STRING)
    private Priority priority;

    public MaintenanceRequest(String title, String description, User user) {
        this.title = title;
        this.description = description;
        this.createdBy = user;
    }

    protected MaintenanceRequest() {

    }

    //----------------------------------------GETTERS---------------------------------//
    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }


    public Unit getUnit() {
        return unit;
    }

    public User getCreatedBy() {
        return createdBy;
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


    //------------------------------------------SETTERS------------------------------------//
    public void updateDescription(String description) {
        this.description = description;
    }

    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        updatedAt = LocalDateTime.now();
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void updateStatus(Status status) {
        this.status = status;
    }

    public void updatePriority(Priority priority) {
        this.priority = priority;
    }
}
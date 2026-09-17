package com.fixitnow.Domain;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Unit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String unitNumber;

    @ManyToOne
    private Property property;

    @OneToMany(mappedBy = "unit")
    private final List<MaintenanceRequest> maintenanceRequests = new ArrayList<>();

    public Unit(String unitNumber) {
        this.unitNumber = unitNumber;
    }

    protected Unit() {

    }
    //-----------------GETTERS------------------//
    public Long getId() {
        return id;
    }

    public String getUnitNumber() {
        return unitNumber;
    }

    public Property getProperty() {
        return property;
    }

    public List getMaintenanceRequests() {
        return this.maintenanceRequests;
    }

    //---------------------SETTERS-------------------//

    public void setProperty(Property property) {
        this.property = property;
    }

    //------------------------------------------------------------------------------------------//

    public void addMaintenanceRequest (MaintenanceRequest request) {
        this.maintenanceRequests.add(request);
        request.setUnit(this);
    }


}
package com.fixitnow.Domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Unit {

    @Id
    private Long id;

    private final String unitNumber;

    @ManyToOne
    private Property property;

    @OneToMany(mappedBy = "unit")
    private final List<MaintenanceRequest> maintenanceRequests;

    public Unit(Long id, String unitNumber) {
        this.id = id;
        this.unitNumber = unitNumber;
        this.maintenanceRequests = new ArrayList<>();
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
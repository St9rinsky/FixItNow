package com.fixitnow.Domain;

import java.util.ArrayList;
import java.util.List;

public class Unit {

    private final int id;
    private final String unitNumber;
    private Property property;
    private final List<MaintenanceRequest> maintenanceRequests;

    public Unit(int id, String unitNumber) {
        this.id = id;
        this.unitNumber = unitNumber;
        this.maintenanceRequests = new ArrayList<>();
    }

    //-----------------GETTERS------------------//
    public int getId() {
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
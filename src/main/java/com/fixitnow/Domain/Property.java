package com.fixitnow.Domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Property {

    @Id
    private final Long id;

    private String name;
    private String address;

    @OneToMany(mappedBy = "property")
    private final List<Unit> units;

    public Property(Long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.units = new ArrayList<>();
    }

    //----------------------------------GETTERS-------------------------------//
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public List<Unit> getUnits() {
        return units;
    }

    //-----------------------------------------------------SETTERS---------------------------------//
    public void setName(String name) {
        this.name = name;
    }

    public void updateAddress(String address) {
        this.address = address;
    }

    //-----------------------------------------------------------------------------------------------//
    public void addUnit(Unit unit) {
        units.add(unit);
        unit.setProperty(this);
    }
}
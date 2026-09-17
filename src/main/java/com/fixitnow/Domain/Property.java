package com.fixitnow.Domain;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Property {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String address;

    @OneToMany(mappedBy = "property")
    private final List<Unit> units = new ArrayList<>();

    public Property(String name, String address) {
        this.name = name;
        this.address = address;
    }

    protected Property () {

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
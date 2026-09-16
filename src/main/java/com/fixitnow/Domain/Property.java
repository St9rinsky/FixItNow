package Domain;

import java.util.ArrayList;
import java.util.List;

public class Property {

    private final int id;
    private String name;
    private String address;
    private final List<Unit> units;

    public Property(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.units = new ArrayList<>();
    }

    //----------------------------------GETTERS-------------------------------//
    public int getId() {
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
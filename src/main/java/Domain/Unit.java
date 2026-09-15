package Domain;

public class Unit {

    private int id;
    private String unitNumber;
    private Property property;

    public Unit(int id, String unitNumber) {
        this.id = id;
        this.unitNumber = unitNumber;
    }

    public int getId() {
        return id;
    }

    public String getUnitNumber() {
        return unitNumber;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }
}
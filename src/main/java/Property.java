import java.util.ArrayList;
import java.util.List;

public class Property {

    private int id;
    private String name;
    private String address;
    private List<Unit> units;

    public Property(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.units = new ArrayList<>();
    }

    public void addUnit(Unit unit) {
        units.add(unit);
    }

    public List<Unit> getUnits() {
        return units;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
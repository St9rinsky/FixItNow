package Domain;

public class MaintenanceRequest {

    private int id;
    private String title;
    private String description;

    private Unit unit;
    private User createdBy;

    public MaintenanceRequest(int id, String title, String description, Unit unit, User user) {
        this.id = id;
        this.title = title;
        this.description = description;

        this.unit = unit;
        this.createdBy = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }
}
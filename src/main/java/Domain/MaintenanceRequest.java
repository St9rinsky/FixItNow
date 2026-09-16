package Domain;

public class MaintenanceRequest {

    private final int id;
    private final String title;
    private String description;
    private final String createdAt;
    private String updatedAt;

    private Unit unit;
    private final User createdBy;

    private Status status;
    private Priority priority;

    public MaintenanceRequest(int id, String title, String description, User user) {
        this.id = id;
        this.title = title;
        this.description = description;

        this.createdBy = user;
        this.createdAt = "now";
    }

    //----------------------------------------GETTERS---------------------------------//
    public int getId() {
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

    public User getAuthor() {
        return createdBy;
    }

    public Status getStatus() {
        return status;
    }

    public Priority getPriority() {
        return priority;
    }

    public String getCreatedAt() {
        return createdAt;
    }


    //------------------------------------------SETTERS------------------------------------//
    public void updateDescription(String description) {
        this.description = description;
    }

    public void updateTime(String updated) {
        this.updatedAt = updated;
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
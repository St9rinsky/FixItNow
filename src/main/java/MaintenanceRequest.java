public class MaintenanceRequest {

    private int id;
    private String title;
    private String description;

    private Unit unit;

    public MaintenanceRequest(int id, String title, String description, Unit unit) {
        this.id = id;
        this.title = title;
        this.description = description;

        this.unit = unit;
    }
}
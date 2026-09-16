package Service;

import Domain.MaintenanceRequest;
import Domain.Unit;
import Domain.User;

public class MaintenanceRequestService {

    public MaintenanceRequest createRequest(
            String title,
            String description,
            User user,
            Unit unit) {
        MaintenanceRequest request = new MaintenanceRequest(title, description, user);
        unit.addMaintenanceRequest(request);

        return request;
    }
}

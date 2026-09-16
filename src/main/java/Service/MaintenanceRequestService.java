package Service;

import Domain.MaintenanceRequest;
import Domain.Unit;
import Domain.User;
import Repository.MaintenanceRequestRepository;

public class MaintenanceRequestService {
    private final MaintenanceRequestRepository repo;

    public MaintenanceRequestService(MaintenanceRequestRepository repository) {
        this.repository = repository;
    }

    public MaintenanceRequest createRequest(
            String title,
            String description,
            User user,
            Unit unit) {
        MaintenanceRequest request = new MaintenanceRequest(title, description, user);
        unit.addMaintenanceRequest(request);

        repo.save(request);

        return request;
    }
}

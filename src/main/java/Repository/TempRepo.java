package Repository;

import Domain.MaintenanceRequest;

import java.util.ArrayList;
import java.util.List;

public class TempRepo implements MaintenanceRequestRepository {
    private final List<MaintenanceRequest> requests = new ArrayList<>();

    @Override
    public MaintenanceRequest save(MaintenanceRequest request) {
        requests.add(request);
        return request;
    }
}

package com.fixitnow.Service;

import com.fixitnow.Domain.MaintenanceRequest;
import com.fixitnow.Domain.Unit;
import com.fixitnow.Domain.User;
import com.fixitnow.Repository.MaintenanceRequestRepository;
import org.springframework.stereotype.Service;

@Service
public class MaintenanceRequestService {
    private final MaintenanceRequestRepository repo;

    public MaintenanceRequestService(MaintenanceRequestRepository repository) {
        this.repo = repository;
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

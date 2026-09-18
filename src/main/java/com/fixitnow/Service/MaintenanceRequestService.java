package com.fixitnow.Service;

import com.fixitnow.Domain.MaintenanceRequest;
import com.fixitnow.Domain.Unit;
import com.fixitnow.Domain.User;
import com.fixitnow.Repository.MaintenanceRequestRepository;
import com.fixitnow.Repository.UnitRepository;
import com.fixitnow.Repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaintenanceRequestService {
    private final MaintenanceRequestRepository repo;
    private final UserRepository userRepo;
    private final UnitRepository unitRepo;

    public MaintenanceRequestService(
            MaintenanceRequestRepository repository,
            UserRepository userRepo,
            UnitRepository unitRepo) {
        this.repo = repository;
        this.userRepo = userRepo;
        this.unitRepo = unitRepo;
    }

    public MaintenanceRequest createRequest(
            String title,
            String description,
            Long userId,
            Long unitId) {
        User user = userRepo.findById(userId).orElseThrow();
        Unit unit = unitRepo.findById(unitId).orElseThrow();
        MaintenanceRequest request = new MaintenanceRequest(title, description, user);
        unit.addMaintenanceRequest(request);

        repo.save(request);

        return request;
    }

    public List<MaintenanceRequest> getAllRequests() {
        return repo.findAll();
    }

    public MaintenanceRequest getRequestById(Long id) {
        return repo.findById(id).orElseThrow();
    }
}

package com.fixitnow.Service;

import com.fixitnow.DTO.Requests.UpdateMaintenanceRequest;
import com.fixitnow.Domain.MaintenanceRequest;
import com.fixitnow.Domain.Unit;
import com.fixitnow.Domain.User;
import com.fixitnow.Exceptions.ResourceNotFoundException;
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

    //CREATE
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

    //GET
    public List<MaintenanceRequest> getAllRequests() {
        return repo.findAll();
    }

    public MaintenanceRequest getRequestById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(
                        "Maintenance request not found: " + id));
    }

    //UPDATE
    public MaintenanceRequest updateRequest(Long id, UpdateMaintenanceRequest update) {
        MaintenanceRequest request = repo.findById(id)
        .orElseThrow(() -> new ResourceNotFoundException(
                "Maintenance request not found: " + id));

        if (update.getDescription()!= null && !update.getDescription().isBlank()){
            request.setDescription(update.getDescription());
        }
        if (update.getStatus()!= null) {
            request.updateStatus(update.getStatus());
        }
        if (update.getPriority() != null) {
            request.updatePriority(update.getPriority());
        }

        return repo.save(request);
    }

    //DELETE
    public void deleteRequest(Long id) {
        MaintenanceRequest request = repo.findById(id)
        .orElseThrow(() -> new ResourceNotFoundException(
                "Maintenance request not found: " + id));

        repo.delete(request);
    }
}

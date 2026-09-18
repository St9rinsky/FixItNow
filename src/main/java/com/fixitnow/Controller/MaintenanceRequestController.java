package com.fixitnow.Controller;

import com.fixitnow.DTO.Requests.CreateMaintenanceRequest;
import com.fixitnow.DTO.Response.MaintenanceRequestResponse;
import com.fixitnow.Domain.MaintenanceRequest;
import com.fixitnow.Service.MaintenanceRequestService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/maintenance-requests")
public class MaintenanceRequestController {
    private final MaintenanceRequestService service;

    public MaintenanceRequestController(MaintenanceRequestService service) {
        this.service = service;
    }

    @PostMapping
    public MaintenanceRequestResponse createdRequest(@RequestBody CreateMaintenanceRequest request)  {
        MaintenanceRequest maintenanceRequest = service.createRequest(
                request.getTitle(),
                request.getDescription(),
                request.getUserId(),
                request.getUnitId()
        );
        MaintenanceRequestResponse response = new MaintenanceRequestResponse(maintenanceRequest);
        return response;
   }

    @GetMapping
    public List<MaintenanceRequestResponse> getAllRequests() {

        List<MaintenanceRequest> requests = service.getAllRequests();

        return requests.stream()
                .map(request -> new MaintenanceRequestResponse(request))
                .toList();
    }
}

package com.fixitnow.Controller;

import com.fixitnow.Domain.MaintenanceRequest;
import com.fixitnow.Domain.Roles;
import com.fixitnow.Domain.Unit;
import com.fixitnow.Domain.User;
import com.fixitnow.Service.MaintenanceRequestService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/maintenance-requests")
public class MaintenanceRequestController {
    private final MaintenanceRequestService service;

    public MaintenanceRequestController(MaintenanceRequestService service) {
        this.service = service;
    }

    @PostMapping
    public MaintenanceRequest createRequest() {

        User user = new User(
                "sello",
                "sello@gmail.com",
                "+1234",
                Roles.TENANT
        );

        Unit unit = new Unit("210");

        return service.createRequest(
                "Leaking tap",
                "The kitchen tap is leaking.",
                1L,
                1L
        );
    }
}

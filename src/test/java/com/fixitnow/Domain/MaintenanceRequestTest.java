package com.fixitnow.Domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaintenanceRequestTest {
    @Test
    void shouldUpdateStatus() {

        MaintenanceRequest request =
                new MaintenanceRequest(
                        "broken window",
                        "bedroom window won't close.",
                        null
                );
        assertEquals(Status.OPEN, request.getStatus());
        request.updateStatus(Status.IN_PROGRESS);
        assertEquals(Status.IN_PROGRESS, request.getStatus());
    }
}

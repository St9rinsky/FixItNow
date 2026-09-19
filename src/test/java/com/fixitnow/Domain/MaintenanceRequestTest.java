package com.fixitnow.Domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class MaintenanceRequestTest {
    private MaintenanceRequest request;

    @BeforeEach
    void setUp(){
        request = new MaintenanceRequest(
                "broken window",
                "bedroom window wont close",
                null
        );
    }


    @Test
    void shouldUpdateStatus() {
        assertEquals(Status.OPEN, request.getStatus());
        request.updateStatus(Status.IN_PROGRESS);
        assertEquals(Status.IN_PROGRESS, request.getStatus());
    }

    @Test
    void shouldUpdatePriority() {
        request.updatePriority(Priority.HIGH);
        assertEquals(Priority.HIGH, request.getPriority());
    }

    @Test
    void shouldUpdateDescription() {
        request.updateDescription("The window is completely broken.");
        assertEquals("The window is completely broken.", request.getDescription());
    }

    @Test
    void shouldHaveDefaultStatusAndPriority() {
        assertEquals(Status.OPEN, request.getStatus());
        assertNull(request.getPriority());
    }
}

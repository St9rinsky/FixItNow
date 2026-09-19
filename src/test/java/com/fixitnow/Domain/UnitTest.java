package com.fixitnow.Domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UnitTest {
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
    void shouldAddMaintenanceRequestToUnit() {
        Unit unit = new Unit("101");

        unit.addMaintenanceRequest(request);

        assertTrue(unit.getMaintenanceRequests().contains(request));
        assertEquals(unit, request.getUnit());
    }
}

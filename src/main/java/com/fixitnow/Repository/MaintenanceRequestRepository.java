package com.fixitnow.Repository;

import com.fixitnow.Domain.MaintenanceRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaintenanceRequestRepository
        extends JpaRepository<MaintenanceRequest, Long> {

}

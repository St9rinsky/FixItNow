package com.fixitnow.Repository;

import com.fixitnow.Domain.Unit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UnitRepository
        extends JpaRepository<Unit, Long> {
}
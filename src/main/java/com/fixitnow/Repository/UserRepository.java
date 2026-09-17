package com.fixitnow.Repository;

import com.fixitnow.Domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository
        extends JpaRepository<User, Long> {
}
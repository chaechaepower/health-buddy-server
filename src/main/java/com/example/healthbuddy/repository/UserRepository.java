package com.example.healthbuddy.repository;

import com.example.healthbuddy.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}

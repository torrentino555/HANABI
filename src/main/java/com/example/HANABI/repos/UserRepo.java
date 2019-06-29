package com.example.HANABI.repos;

import com.example.HANABI.domain.UserProjects;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserProjects, Long> {
    UserProjects findByUsername(String username);
}

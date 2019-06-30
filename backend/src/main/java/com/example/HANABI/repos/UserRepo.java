package com.example.HANABI.repos;

import com.example.HANABI.domain.User;
import com.example.HANABI.domain.UserProjects;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByFirstName(String username);
}

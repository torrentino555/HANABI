package com.example.HANABI.controller;

import com.example.HANABI.DTO.UserProjectsDTO;
import com.example.HANABI.repos.UserProject;
import com.example.HANABI.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@Controller
public class UserController {

    @Autowired
    UserRepo userRepo;

    @GetMapping("/userInfo")
    public ResponseEntity<UserProjectsDTO> getUserInfo() {

        UserProjectsDTO  userProjectsDTO = new UserProjectsDTO();

        UserProject up = mock(UserProject.class);
        when(up.getUserProjectDTO()).thenReturn(userProjectsDTO);

        return ResponseEntity.ok(up.getUserProjectDTO());
    }
}

package com.example.HANABI.controller;

import com.example.HANABI.DTO.ProjectDTO;
import com.example.HANABI.DTO.TagsDTO;
import com.example.HANABI.DTO.UserProjectsDTO;
import com.example.HANABI.constants.SettingsConstants;
import com.example.HANABI.domain.Projects;
import com.example.HANABI.repos.UserProject;
import com.example.HANABI.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@Controller
public class UserController {

    @Autowired
    UserRepo userRepo;

    @GetMapping("/userInfo")
    public ResponseEntity<UserProjectsDTO> getUserInfo(@RequestParam("nickname") String nickname) {

        UserProjectsDTO  userProjectsDTO = getGeneratedUserProjectsDTO(nickname);
        return ResponseEntity.ok(userProjectsDTO);
    }

    private UserProjectsDTO getGeneratedUserProjectsDTO(String nickname) {
        UserProjectsDTO  userProjectsDTO = new UserProjectsDTO();
        userProjectsDTO.setNickname(nickname);
        userProjectsDTO.setMessage("");

        Set<ProjectDTO> set = new HashSet<>();
        ProjectDTO projectDTO = new ProjectDTO();
        projectDTO.setCountOfActiveTeams(3);
        projectDTO.setId(3);
        projectDTO.setTitle("Developing of website");
        List<String> list = new ArrayList<>();
        list.add(SettingsConstants.WEB);
        projectDTO.setTags(list);

        set.add(projectDTO);


        projectDTO = new ProjectDTO();
        projectDTO.setCountOfActiveTeams(2);
        projectDTO.setId(4);
        projectDTO.setTitle("Developing of console game");
        list = new ArrayList<>();
        list.add(SettingsConstants.CONSOLE);
        list.add(SettingsConstants.OS);
        projectDTO.setTags(list);

        set.add(projectDTO);

        userProjectsDTO.setCompletedProjects(new HashSet<>(set));

        set.clear();

//--------------------------------------------
        projectDTO = new ProjectDTO();
        projectDTO.setCountOfActiveTeams(6);
        projectDTO.setId(4);
        projectDTO.setTitle("Developing of console game");
        list = new ArrayList<>();
        list.add(SettingsConstants.CONSOLE);
        list.add(SettingsConstants.OS);
        projectDTO.setTags(list);


        set.add(projectDTO);

        projectDTO = new ProjectDTO();
        projectDTO.setCountOfActiveTeams(7);
        projectDTO.setId(5);
        projectDTO.setTitle("Developing for controller");
        list = new ArrayList<>();
        list.add(SettingsConstants.EMBEDDED);
        projectDTO.setTags(list);

        set.add(projectDTO);

        projectDTO = new ProjectDTO();
        projectDTO.setCountOfActiveTeams(2);
        projectDTO.setId(9);
        projectDTO.setTitle("Developing plugin");
        list = new ArrayList<>();
        list.add(SettingsConstants.OS);
        projectDTO.setTags(list);

        set.add(projectDTO);

        userProjectsDTO.setCurrentProjects(new HashSet<>(set));
        userProjectsDTO.setResponseStatus("SUCCESS");

        userProjectsDTO.setDescription("We are the coolest company in the world. We are doing the coolest things in the world!");
        return userProjectsDTO;
    }
}

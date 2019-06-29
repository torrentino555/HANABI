package com.example.HANABI.controller;

import com.example.HANABI.domain.Role;
import com.example.HANABI.domain.UserProjects;
import com.example.HANABI.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Collections;
import java.util.Map;

@Controller
public class RegistrationController {

    @Autowired
    private UserRepo userRepo;
    @GetMapping("/registration")
    public String registration(){
        return"registration";
    }

    @PostMapping("/registration")
    public String addUser(UserProjects user, Map<String, Object> model) {
        UserProjects userFromDb = userRepo.findByUsername(user.getUsername());

        if (userFromDb != null) {
            model.put("message", "UserProjects exists!");
            return "registration";
        }

        user.setActive(true);
        user.setRoles(Collections.singleton(Role.USER));
        userRepo.save(user);

        return "redirect:/login";
    }

}

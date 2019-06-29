package com.example.HANABI.controller;

import com.example.HANABI.domain.User;
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
    public String addUser(User user, Map<String, Object> model) {
        User userFromDb = userRepo.findByUsername(user.getEmail());

        if (userFromDb != null) {
            model.put("message", "UserProjects exists!");
            return "registration";
        }

        return "redirect:/login";
    }

}

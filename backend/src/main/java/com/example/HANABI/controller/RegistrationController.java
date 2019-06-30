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


    @GetMapping("/registration")
    public String registration(){
        return"registration";
    }



}

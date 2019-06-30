package com.example.HANABI.controller;


import com.example.HANABI.DTO.UserDTO;
import com.example.HANABI.domain.User;
import com.example.HANABI.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class MainController {

    @Autowired
    UserRepo userRepo;

    @GetMapping("/getUser")
    public ResponseEntity<UserDTO> greeting(@RequestParam("username") String username){
        User user = userRepo.findByFirstName(username);

        UserDTO userDTO = new UserDTO(user);
        return ResponseEntity.ok(userDTO);
    }
//    @GetMapping("/main")
//    public String main(Map<String, Object> model) {
//        Iterable<Message> messages = messageRepo.findAll();
//        model.put("messages", messages);
//        return "main";
//    }


}

package com.example.HANABI.controller;

import com.example.HANABI.DTO.*;
import com.sun.javaws.progress.Progress;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;
import java.util.ArrayList;
import java.util.List;

@Controller
public class TasksController {

    @PostMapping(value = "/tasksByTags", produces = "application/json")
    ResponseEntity<TasksAnswerDTO> getTasksByTag(@RequestBody TagsDTO tagsDTO) {

        TasksAnswerDTO tasksAnswerDTO = new TasksAnswerDTO();
        List<TasksDTO> list = new ArrayList<>();
        TasksDTO tasksDTO = new TasksDTO();
        tasksDTO.setCountOfActiveTeams(6);
        tasksDTO.setTitle("Developing of console game");
        tasksDTO.setId(4);
        tasksDTO.setDescription("Simple RPG game for PS4 with VR headset");
        list.add(tasksDTO);
        tasksAnswerDTO.setTasks(list);
        return ResponseEntity.ok(tasksAnswerDTO);
    }

    @PostMapping(value = "/juniorsBySkills", produces = "application/json")
    ResponseEntity<JuniorsAnswerDTO> getJuniorsBySkills(@RequestBody SkillsDTO skillsDTO) {
        JuniorsAnswerDTO juniorsAnswerDTO = new JuniorsAnswerDTO();
        List<JuniorsDTO> juniorsDTOList = new ArrayList<>();
        JuniorsDTO juniorsDTO = new JuniorsDTO();
        juniorsDTOList.add(juniorsDTO);
        juniorsAnswerDTO.setJuniors(juniorsDTOList);
        return ResponseEntity.ok(juniorsAnswerDTO);
    }

    @GetMapping(value = "/progressByRoomId", produces = "application/json")
    ResponseEntity<ProgressDTO> getProgressDTO(@RequestParam(name ="roomId") int number) {
        ProgressDTO progressDTO = new ProgressDTO();
        return ResponseEntity.ok(progressDTO);
    }
}

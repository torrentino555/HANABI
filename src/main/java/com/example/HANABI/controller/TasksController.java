package com.example.HANABI.controller;

import com.example.HANABI.DTO.*;
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
        List<JuniorsDTO> juniorsDTOList = getGeneratedJuniours();
        juniorsAnswerDTO.setJuniors(juniorsDTOList);
        return ResponseEntity.ok(juniorsAnswerDTO);
    }

    @GetMapping(value = "/progressByRoomId", produces = "application/json")
    ResponseEntity<ProgressDTO> getProgressDTO(@RequestParam(name ="roomId") int number) {
        ProgressDTO progressDTO = new ProgressDTO();
        return ResponseEntity.ok(progressDTO);
    }

    @PostMapping(value = "/changeProgress", produces = "application/json")
    ResponseEntity<String> changeProgress(@RequestParam(name = "progress") int progress) {
        return ResponseEntity.ok("ok");
    }


    private List<JuniorsDTO> getGeneratedJuniours() {
        List<JuniorsDTO> juniorsDTOList = new ArrayList<JuniorsDTO>();

        JuniorsDTO juniorsDTO1 = new JuniorsDTO();
        JuniorsDTO juniorsDTO2 = new JuniorsDTO();
        JuniorsDTO juniorsDTO3 = new JuniorsDTO();
        JuniorsDTO juniorsDTO4 = new JuniorsDTO();

        juniorsDTO1.setId(1);
        juniorsDTO1.setFullName("ilya");
        juniorsDTO1.setAvgLevel(16);


        juniorsDTO2.setId(2);
        juniorsDTO2.setFullName("Kirill");
        juniorsDTO2.setAvgLevel(25);

        juniorsDTO3.setId(3);
        juniorsDTO3.setFullName("Vlad");
        juniorsDTO3.setAvgLevel(43);

        juniorsDTO4.setId(4);
        juniorsDTO4.setFullName("Artyom");
        juniorsDTO4.setAvgLevel(38);

        juniorsDTOList.add(juniorsDTO1);
        juniorsDTOList.add(juniorsDTO2);
        juniorsDTOList.add(juniorsDTO3);
        juniorsDTOList.add(juniorsDTO4);

        return juniorsDTOList;

    }
}

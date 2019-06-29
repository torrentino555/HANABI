package com.example.HANABI.DTO;

import com.example.HANABI.constants.SettingsConstants;

import java.util.List;

public class TasksAnswerDTO {

    private List<TasksDTO> tasks;

    public List<TasksDTO> getTasks() {
        return tasks;
    }

    public void setTasks(List<TasksDTO> tasks) {
        this.tasks = tasks;
    }
}

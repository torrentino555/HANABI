package com.example.HANABI.DTO;

public class TasksDTO {
    private int id;
    private String title;
    private String description;
    private int countOfActiveTeams;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCountOfActiveTeams() {
        return countOfActiveTeams;
    }

    public void setCountOfActiveTeams(int countOfActiveTeams) {
        this.countOfActiveTeams = countOfActiveTeams;
    }
}

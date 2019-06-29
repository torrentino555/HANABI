package com.example.HANABI.DTO;

public class UserProjectsDTO {
    private String nickname;
    private String currentProjects;
    private String completedProjects;
    private String description;
    private String responseStatus;
    private String message;

    public UserProjectsDTO(){}

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getCurrentProjects() {
        return currentProjects;
    }

    public void setCurrentProjects(String currentProjects) {
        this.currentProjects = currentProjects;
    }

    public String getCompletedProjects() {
        return completedProjects;
    }

    public void setCompletedProjects(String completedProjects) {
        this.completedProjects = completedProjects;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(String responseStatus) {
        this.responseStatus = responseStatus;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

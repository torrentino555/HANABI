package com.example.HANABI.DTO;

import java.util.Set;

public class UserProjectsDTO {
    private String nickname;
    private Set<ProjectDTO> currentProjects;
    private Set<ProjectDTO> completedProjects;
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

    public Set<ProjectDTO> getCurrentProjects() {
        return currentProjects;
    }

    public void setCurrentProjects(Set<ProjectDTO> currentProjects) {
        this.currentProjects = currentProjects;
    }

    public Set<ProjectDTO> getCompletedProjects() {
        return completedProjects;
    }

    public void setCompletedProjects(Set<ProjectDTO> completedProjects) {
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

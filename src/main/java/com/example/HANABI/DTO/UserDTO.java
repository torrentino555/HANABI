package com.example.HANABI.DTO;

import com.example.HANABI.domain.User;
import com.example.HANABI.domain.UserProjects;
import com.example.HANABI.domain.UsersCompetencies;

import javax.persistence.*;
import java.util.Set;

public class UserDTO {
    private int userId;
    private Boolean mentor;
    private String firstName;
    private String lastName;
    private String email;
    private Set<UsersCompetencies> usersCompetencies;
    private Set<UserProjects> userProjects;

    UserDTO(){}

    public UserDTO(User user) {
        this.userId = user.getUserId();
        this.mentor = user.isMentor();
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
        this.email = user.getEmail();
        this.usersCompetencies = user.getUsersCompetencies();
        this.userProjects = user.getUserProjects();
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Boolean getMentor() {
        return mentor;
    }

    public void setMentor(Boolean mentor) {
        this.mentor = mentor;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<UsersCompetencies> getUsersCompetencies() {
        return usersCompetencies;
    }

    public void setUsersCompetencies(Set<UsersCompetencies> usersCompetencies) {
        this.usersCompetencies = usersCompetencies;
    }

    public Set<UserProjects> getUserProjects() {
        return userProjects;
    }

    public void setUserProjects(Set<UserProjects> userProjects) {
        this.userProjects = userProjects;
    }
}

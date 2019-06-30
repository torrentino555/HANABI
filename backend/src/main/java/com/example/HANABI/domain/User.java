package com.example.HANABI.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "user_hanabi")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private int userId;
    @Column(name = "mentor")
    private Boolean mentor;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String email;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private Set<UsersCompetencies> usersCompetencies;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private Set<UserProjects> userProjects;

    User(){}

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public boolean isMentor() {
        return mentor;
    }

    public void setMentor(boolean mentor) {
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

    public Boolean getMentor() {
        return mentor;
    }

    public void setMentor(Boolean mentor) {
        this.mentor = mentor;
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

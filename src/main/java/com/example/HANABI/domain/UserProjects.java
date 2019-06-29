package com.example.HANABI.domain;

import javax.annotation.Generated;
import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "users_projects")
public class UserProjects {

    UserProjects() {}

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public long getProjects_id() {
        return projects_id;
    }

    public void setProjects_id(long projects_id) {
        this.projects_id = projects_id;
    }

    public int getStory_point() {
        return story_point;
    }

    public void setStory_point(int story_point) {
        this.story_point = story_point;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public long getLines_of_code() {
        return lines_of_code;
    }

    public void setLines_of_code(long lines_of_code) {
        this.lines_of_code = lines_of_code;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long user_id;
    private long projects_id;
    private int story_point;
    private int progress;
    private long lines_of_code;
    private int stars;
    private int level;

    @ElementCollection(targetClass =  Role.class, fetch = FetchType.EAGER)
    @CollectionTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"))
    @Enumerated(EnumType.STRING)
    private Set<Role> roles;

}

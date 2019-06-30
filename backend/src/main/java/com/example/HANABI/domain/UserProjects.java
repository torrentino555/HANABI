package com.example.HANABI.domain;

import jdk.nashorn.internal.ir.PropertyKey;

import javax.annotation.Generated;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "users_projects")
public class UserProjects implements Serializable {

    UserProjects() {}


    @Id
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Id
    @ManyToOne
    @JoinColumn(name = "projects_id")
    private Projects projects;

    @Column(name = "story_point")
    private int storyPoint;
    @Column(name = "progress")
    private int progress;
    @Column(name = "lines_of_code")
    private long linesOfCode;
    @Column(name = "starts")
    private int stars;
    @Column(name = "level")
    private int level;



}

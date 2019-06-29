package com.example.HANABI.domain;

import javax.annotation.Generated;
import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "users_projects")
public class UserProjects {

    UserProjects() {}


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private long userId;
    @Column(name = "projects_id")
    private long projectsId;
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

    @ElementCollection(targetClass =  Role.class, fetch = FetchType.EAGER)
    @CollectionTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"))
    @Enumerated(EnumType.STRING)
    private Set<Role> roles;

}

package com.example.HANABI.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "projects")
public class Projects {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="project_id")
    private int projectId;
    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "projectsId", cascade = CascadeType.ALL)
    private Set<CompaniesProjects> CompaniesProjects;

    @OneToMany(mappedBy = "projectsId", cascade = CascadeType.ALL)
    private Set<ProjectTags> ProjectTags;

    @OneToMany(mappedBy = "projectsId", cascade = CascadeType.ALL)
    private Set<ProjectsTasks> projectsTasks;

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

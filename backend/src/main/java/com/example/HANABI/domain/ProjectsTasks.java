package com.example.HANABI.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "projects_tasks")
public class ProjectsTasks implements Serializable {



    @Id
    @ManyToOne
    @JoinColumn(name = "project_id")
    private Projects projects;

    @Id
    @ManyToOne
    @JoinColumn(name = "task_id")
    private Task task;

    @Column(name = "description")
    private String description;

    @Column(name = "story_point")
    private int storyPoint;

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public Projects getProjects() {
        return projects;
    }

    public void setProjects(Projects projects) {
        this.projects = projects;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStoryPoint() {
        return storyPoint;
    }

    public void setStoryPoint(int storyPoint) {
        this.storyPoint = storyPoint;
    }
}

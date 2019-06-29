package com.example.HANABI.domain;

import javax.persistence.*;
import java.util.Set;

public class Task {
    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public int getStoryPoint() {
        return storyPoint;
    }

    public void setStoryPoint(int storyPoint) {
        this.storyPoint = storyPoint;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "task_id")
    int taskId;
    int storyPoint;
    String Description;

    @OneToMany(mappedBy = "taskId", cascade = CascadeType.ALL)
    private Set<ProjectsTasks> projectsTasks;

}

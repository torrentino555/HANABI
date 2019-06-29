package com.example.HANABI.domain;

import javax.persistence.*;

@Entity
@Table(name = "projects_tasks")
public class ProjectsTasks {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = ("task_id"))
    private int taskId;
    @Column(name = "description")
    private String description;
    @Column(name = "story_point")
    private int storyPoint;

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
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

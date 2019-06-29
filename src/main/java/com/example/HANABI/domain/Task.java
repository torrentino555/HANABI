package com.example.HANABI.domain;

import javax.persistence.*;
import java.util.Set;
@Entity
@Table(name = "task")
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
    private int taskId;

    private int storyPoint;
    private String Description;

    @OneToMany(mappedBy = "task", cascade = CascadeType.ALL)
    private Set<ProjectsTasks> projectsTasks;

}

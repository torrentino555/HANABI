package com.example.HANABI.DTO;

import java.util.List;
import java.util.Set;

public class ProjectDTO {
    private Integer id;
    private String title;
    private Integer countOfActiveTeams;
    private List<String> tags;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getCountOfActiveTeams() {
        return countOfActiveTeams;
    }

    public void setCountOfActiveTeams(Integer activeCount) {
        this.countOfActiveTeams = activeCount;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
}

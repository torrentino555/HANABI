package com.example.HANABI.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "projects_tags")
public class ProjectTags implements Serializable {

    @Id
    @ManyToOne
    @JoinColumn(name = "project_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Projects projects;

    @Id
    @ManyToOne
    @JoinColumn(name = "tag_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Tags tags;

    private String fieldname;

    public Projects getProjects() {
        return projects;
    }

    public void setProjects(Projects projects) {
        this.projects = projects;
    }

    public Tags getTags() {
        return tags;
    }

    public void setTags(Tags tags) {
        this.tags = tags;
    }

    public String getFieldname() {
        return fieldname;
    }

    public void setFieldname(String fieldname) {
        this.fieldname = fieldname;
    }
}

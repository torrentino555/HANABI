package com.example.HANABI.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "projects_tags")
public class ProjectTags {
    //TODO привязка
    private int projectId;
    private int tagId;
    private String fieldname;

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public int getTagId() {
        return tagId;
    }

    public void setTagId(int tagId) {
        this.tagId = tagId;
    }

    public String getFieldname() {
        return fieldname;
    }

    public void setFieldname(String fieldname) {
        this.fieldname = fieldname;
    }
}

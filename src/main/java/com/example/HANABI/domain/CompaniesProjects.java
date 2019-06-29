package com.example.HANABI.domain;

import javax.persistence.*;

@Entity
@Table(name = "companies_projects")
public class CompaniesProjects {
//TODO привязка
    @Id
    @ManyToOne
    @JoinColumn
    @Column(name = "company_id")
    private int companyId;
    @Id
    @ManyToOne
    @JoinColumn
    @Column(name = "projects_id")
    private int projectsId;

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public int getProjectsId() {
        return projectsId;
    }

    public void setProjectsId(int projectsId) {
        this.projectsId = projectsId;
    }
}

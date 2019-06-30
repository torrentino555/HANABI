package com.example.HANABI.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "companies_projects")
public class CompaniesProjects implements Serializable {
//TODO привязка
    @Id
    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;
    @Id
    @ManyToOne
    @JoinColumn(name = "projects_id")
    private Projects projects;

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Projects getProjects() {
        return projects;
    }

    public void setProjects(Projects projects) {
        this.projects = projects;
    }
}

package com.example.HANABI.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "company")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "company_id")
    private int companyId;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "companyId", cascade = CascadeType.ALL)
    private Set<CompaniesProjects> companiesProject;

    public Set<CompaniesProjects> getCompaniesProject() {
        return companiesProject;
    }

    public void setCompaniesProject(Set<CompaniesProjects> companiesProject) {
        this.companiesProject = companiesProject;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

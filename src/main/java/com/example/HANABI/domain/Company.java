package com.example.HANABI.domain;

import javax.persistence.*;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

    public Company(String name, String description, CompaniesProjects ... companiesProject) {
        this.name = name;
        this.description = description;
        for(CompaniesProjects companyProject : companiesProject) companyProject.setCompany(this);
        this.companiesProject = Stream.of(companiesProject).collect(Collectors.toSet());
    }

    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL)
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

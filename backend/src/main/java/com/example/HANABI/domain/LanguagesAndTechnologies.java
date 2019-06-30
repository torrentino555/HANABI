package com.example.HANABI.domain;

import javax.persistence.*;
import java.util.Set;

    @Entity
    @Table(name = "languages_and_technologies")
    public class LanguagesAndTechnologies {


        public long getLanguagesId() {
            return languagesId;
        }

        public void setLanguagesId(long languagesId) {
            this.languagesId = languagesId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name="languages_id")
        private long languagesId;
        private String name;

        @OneToMany(mappedBy = "languagesAndTechnologies", cascade = CascadeType.ALL)
        private Set<UsersCompetencies> usersCompetencies;


    }



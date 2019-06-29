package com.example.HANABI.domain;

import javax.persistence.*;
import java.util.Set;

    @Entity
    @Table(name = "languages_and_technologies")
    public class LanguagesAndTechnologies {
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setLanguages_id(long languages_id) {
            this.languages_id = languages_id;
        }

        public long getLanguages_id() {
            return languages_id;
        }

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long languages_id;
        private String name;

    }



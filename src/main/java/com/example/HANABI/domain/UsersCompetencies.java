package com.example.HANABI.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "users_competencies")
public class UsersCompetencies {
    private int language_id;
    private int user_id;
    private int lines_of_codes;
    private int stars;
    private int level;

    public int getLanguage_id() {
        return language_id;
    }

    public void setLanguage_id(int language_id) {
        this.language_id = language_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getLines_of_codes() {
        return lines_of_codes;
    }

    public void setLines_of_codes(int lines_of_codes) {
        this.lines_of_codes = lines_of_codes;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}

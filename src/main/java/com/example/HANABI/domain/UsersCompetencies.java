package com.example.HANABI.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "users_competencies")
public class UsersCompetencies {
    //TODO привязка
    public int getLanguageId() {
        return languageId;
    }

    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getLinesOfCodes() {
        return linesOfCodes;
    }

    public void setLinesOfCodes(int linesOfCodes) {
        this.linesOfCodes = linesOfCodes;
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

    @Column(name = "language_id")
    private int languageId;
    @Column(name = "user_id")
    private int userId;
    @Column(name = "lines_of_codes")
    private int linesOfCodes;
    @Column(name = "starts")
    private int stars;
    @Column(name = "level")
    private int level;


}

package com.example.HANABI.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "users_competencies")
public class UsersCompetencies implements Serializable {
    public LanguagesAndTechnologies getLanguagesAndTechnologies() {
        return languagesAndTechnologies;
    }

    public void setLanguagesAndTechnologies(LanguagesAndTechnologies languagesAndTechnologies) {
        this.languagesAndTechnologies = languagesAndTechnologies;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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

    @Id
    @ManyToOne
    @JoinColumn(name = "language_id")
    private LanguagesAndTechnologies languagesAndTechnologies;

    @Id
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @Column(name = "lines_of_codes")
    private int linesOfCodes;
    @Column(name = "starts")
    private int stars;
    @Column(name = "level")
    private int level;


}

package com.example.HANABI.domain;

import javax.persistence.*;

@Entity
@Table(name = "tags")
public class Tags {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "tag_id")
    int tagId;
    @Column(name = "description")
    String decription;

}

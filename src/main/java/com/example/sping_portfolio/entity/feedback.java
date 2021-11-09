package com.example.sping_portfolio.entity;

import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class feedback {

    @Id
    private int id;

    private String title;
    private int positive;
    private String body;
    private String user;

}

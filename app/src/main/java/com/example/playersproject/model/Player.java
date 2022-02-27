package com.example.playersproject.model;

import java.io.Serializable;

public class Player implements Serializable {

    public String name;
    public String surname;
    public String team;
    public String sport;
    public String position;
    public int age;
    public String imageUrl;

    public Player(String name, String surname, String team, int age, String imageUrl) {
        this.name = name;
        this.surname = surname;
        this.team = team;
        this.age = age;
        this.imageUrl = imageUrl;
    }
}

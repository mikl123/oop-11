package com.example.task2;

import lombok.Getter;

@Getter
public class Client{
    private static int nextId = 0;
    private int id;
    private String name;
    private String email;
    private int age;
    private Gender sex;
    public Client(String name,String email, int age, Gender sex) {
        id = nextId;
        nextId++;
        this.name = name;
        this.email = email;
        this.age = age;
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

}
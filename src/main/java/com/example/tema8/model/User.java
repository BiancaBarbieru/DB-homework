package com.example.tema8.model;

import lombok.Data;

import java.util.Random;
import java.util.UUID;

@Data
public class User {
    private int id;
    private String name;
    private int age;
    private static int count;

    public static User createUser() {
        User newOne = new User();

        Random random = new Random();
        newOne.age = random.nextInt(100);

        UUID uuid = UUID.randomUUID();
        newOne.name = uuid.toString();

        newOne.id = count;
        count++;
        return newOne;
    }

}

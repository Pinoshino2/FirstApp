package com.example.firstapp;

import android.util.Log;

public class Cat {
    String name;
    int age;
    String gender;
    String breed;

    Cat(String name, int age, String gender, String breed) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.breed = breed;
    }

    void say(String message) {
        Log.d("Cat", this.name + "「" + message + "」");
    }

    void sleep() {
        say("Zzz");
    }
}

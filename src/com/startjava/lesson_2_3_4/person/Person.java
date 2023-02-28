package com.startjava.lesson_2_3_4.person;

public class Person {

    String sex = "male";
    String name = "Bob";
    double height = 1.80;
    double weight = 73.5;
    int age = 32;

    void go() {
        System.out.println("Bob is going");
    }

    void sit() {
        System.out.println("Bob is sitting");
    }

    void run() {
        System.out.println("Bob is running");
    }

    String say() {
        return "Hello";
    }

    void learnJava() {
        System.out.println("Bob is learning Java");
    }
}
package com.startjava.lesson_2_3.animal;

public class WolfTest {

    public static void main (String[] args) {
        Wolf wolf = new Wolf();
        wolf.setGender("male");
        wolf.setWolfName("Jacob");
        wolf.setColour("brown");
        wolf.setWeight(80.0);
        wolf.setAge(5);

        System.out.println("gender: " + wolf.getGender());
        System.out.println("wolfName: " + wolf.getWolfName());
        System.out.println("colour: " + wolf.getColour());
        System.out.println("weight: " + wolf.getWeight());
        System.out.println("age: " + wolf.getAge());
        
        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.hunt();
        wolf.howl();
    }
}
package com.startjava.lesson_2_3_4.robot;

public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger();
        jaeger1.setModelName("Cherno Alpha");
        jaeger1.setHeight(85.34);
        jaeger1.setSpeed(3);

        Jaeger jaeger2 = new Jaeger("Striker Eureka", 76.2, 10);

        System.out.println("ModelName of the first robot: " + jaeger1.getModelName());
        System.out.println("Height of the first robot: " + jaeger1.getHeight());
        System.out.println("Speed of the first robot: " + jaeger1.getSpeed());
        jaeger1.setSpeed(200);
        System.out.println("Speed of the first robot after coffee: " + jaeger1.getSpeed());
        System.out.println("\n" + jaeger1.getModelName() + " " + jaeger1.hit());
        System.out.println(jaeger2.getModelName() + " is " + jaeger2.defend());
        System.out.println("\nModelName of the second robot: " + jaeger2.getModelName());
        System.out.println("Height of the second robot: " + jaeger2.getHeight());
        System.out.println("Speed of the second robot: " + jaeger2.getSpeed());
        jaeger2.setModelName("Hulk");
        System.out.println("Striker Eureka changed modelName. New modelName is " + jaeger2.getModelName());
    }
}
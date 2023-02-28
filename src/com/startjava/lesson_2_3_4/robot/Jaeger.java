package com.startjava.lesson_2_3_4.robot;


public class Jaeger {

    private String modelName;
    private double height;
    private int speed;

    public Jaeger() {}

    public Jaeger(String modelName, double height, int speed) {
        this.modelName = modelName;
        this.height = height;
        this.speed = speed;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void stand() {
        System.out.println("standing");
    }

    public void move() {
        System.out.println("moving");
    }

    public String hit() {
        return "deals 3 damage";
    }

    public String defend() {
        return "defending";
    }
}

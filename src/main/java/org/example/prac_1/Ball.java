package org.example.prac_1;

public class Ball {

    private String color;
    private int radius;

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public int getRadius() {
        return radius;
    }

    public Ball(int radius) {
        this.radius = radius;
        this.color = "Red";
    }

    public Ball() {
        this.color = "Red";
        this.radius = 1;
    }

    public Ball(String color) {
        this.color = color;
        this.radius = 1;
    }

    public Ball(String color, int radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Ball color is " + this.color + ", radius is " + this.radius;
    }
}

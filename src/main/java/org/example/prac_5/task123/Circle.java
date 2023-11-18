package org.example.prac_5.task123;

class Circle extends Shape {
    protected double radius;

    public Circle(String color, Boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return  2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

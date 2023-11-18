package org.example.prac_5.task123;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle(String color, Boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public Rectangle() {
        super();
        length = 0;
        width = 0;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return super.toString() + "length is " + length + " width is " + width;
    }
}

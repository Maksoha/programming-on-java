package org.example.prac_5.task123;

public class Square extends Rectangle {

    public Square(String color, Boolean filled, double side) {
        super(color, filled, side, side);
    }

    public Square(double side) {
        super(side, side);
    }
    public Square() {
        super();
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        width = side;
        length = side;
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }

    @Override
    public String toString() {
        return "Square color is " + color + " filled is " + filled + " side is " + width;
    }
}

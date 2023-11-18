package org.example.prac_6;

abstract class Dish {
    private String material;
    private String color;

    public Dish(String material, String color) {
        this.material = material;
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void displayInfo();
}

class Plate extends Dish {
    private int diameter;

    public Plate(String material, String color, int diameter) {
        super(material, color);
        this.diameter = diameter;
    }

    @Override
    public void displayInfo() {
        System.out.println("Plate: material - " + getMaterial() + ", color - " + getColor() + ", diameter - " + diameter + " cm");
    }
}

class Cup extends Dish {
    private int capacity;

    public Cup(String material, String color, int capacity) {
        super(material, color);
        this.capacity = capacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Cup: material - " + getMaterial() + ", color = " + getColor() + ", capacity = " + capacity + " ml");
    }
}

class DishTest {
    public static void main(String[] args) {
        Plate plate = new Plate("Ceramic", "White", 20);
        Cup cup = new Cup("Glass", "Clear", 250);

        plate.displayInfo();
        cup.displayInfo();
    }
}


package org.example.prac_6;

abstract class Furniture {
    private String name;
    private String material;
    private double price;

    public Furniture(String name, String material, double price) {
        this.name = name;
        this.material = material;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract void displayInfo();
}

class Chair extends Furniture {
    public Chair(String name, String material, double price) {
        super(name, material, price);
    }

    @Override
    public void displayInfo() {
        System.out.println("Chair: Name - " + getName() + ", Material - " + getMaterial() + ", Price - " + getPrice() + "₽");
    }
}

class Table extends Furniture {
    public Table(String name, String material, double price) {
        super(name, material, price);
    }

    @Override
    public void displayInfo() {
        System.out.println("Table: Name - " + getName() + ", Material - " + getMaterial() + ", Price - " + getPrice() + "₽");
    }
}

class FurnitureShop {
    public static void main(String[] args) {
        Chair chair = new Chair("Dining Chair", "Wood", 3559.99);
        Table table = new Table("Coffee Table", "Glass", 2299.99);

        chair.displayInfo();
        table.displayInfo();
    }
}


package org.example.prac_23;

public final class Drink implements Item {
    private double cost;
    private String name;
    String description;
    public Drink(String name, String description) {
        cost = 0;
        this.name = name;
        this.description = description;
    }
    public Drink(double cost, String name, String description) {
        this.cost = cost;
        this.name = name;
        this.description = description;
    }

    public double getPrice() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "\n"+getClass()+"\nCost: " + getPrice() + "\nName: " + getName() + "\nDescription: " + getDescription() + "\n";
    }
}

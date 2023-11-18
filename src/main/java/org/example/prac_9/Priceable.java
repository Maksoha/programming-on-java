package org.example.prac_9;

public interface Priceable {
    double getPrice();
}

class Car implements Priceable {
    private double price;

    public Car(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

class Product implements Priceable {
    private final double price;

    public Product(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

class PriceableTest {
    public static void main(String[] args) {
        Priceable car = new Car(25000.0);
        Priceable product = new Product(19.99);

        System.out.println("Car price: $" + car.getPrice());
        System.out.println("Product price: $" + product.getPrice());
    }
}
package org.example.prac_9;

public interface Nameable {
    String getName();
}

class Planet implements Nameable {
    private final String name;

    public Planet(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}

class Animals implements Nameable {
    private final String name;

    public Animals(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}


class NameableTest {
    public static void main(String[] args) {
        Nameable planet = new Planet("Earth");
        Nameable animal = new Animals("Lion");

        System.out.println("Planet name: " + planet.getName());
        System.out.println("Animal name: " + animal.getName());
    }
}


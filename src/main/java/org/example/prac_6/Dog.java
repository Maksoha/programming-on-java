package org.example.prac_6;

abstract class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void bark();
}

class Labrador extends Dog {
    public Labrador(String name, int age) {
        super(name, age);
    }

    @Override
    public void bark() {
        System.out.println(getName() + " (Labrador) is barking: Woof! Woof!");
    }
}

class Pug extends Dog {
    public Pug(String name, int age) {
        super(name, age);
    }

    @Override
    public void bark() {
        System.out.println(getName() + " (Pug) is barking: Woof!");
    }
}

class DogTest {
    public static void main(String[] args) {
        Labrador labrador = new Labrador("Шарик", 3);
        Pug pug = new Pug("Барбос", 12);

        labrador.bark();
        pug.bark();
    }
}


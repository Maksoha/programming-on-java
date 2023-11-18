package org.example.prac_18;

import org.example.prac_9.Nameable;

import java.io.Serializable;

public class GenericClass<T extends Comparable<T>, V extends Animal & Serializable, K> {
    private T variableT;
    private V variableV;
    private K variableK;

    public GenericClass(T variableT, V variableV, K variableK) {
        this.variableT = variableT;
        this.variableV = variableV;
        this.variableK = variableK;
    }

    public T getVariableT() {
        return variableT;
    }

    public V getVariableV() {
        return variableV;
    }

    public K getVariableK() {
        return variableK;
    }

    public void displayClassNames() {
        System.out.println("Variable T belongs to class: " + variableT.getClass().getName());
        System.out.println("Variable V belongs to class: " + variableV.getClass().getName());
        System.out.println("Variable K belongs to class: " + variableK.getClass().getName());
    }
}

class Animal implements Nameable {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}


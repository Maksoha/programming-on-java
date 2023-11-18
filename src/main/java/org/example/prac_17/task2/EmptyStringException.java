package org.example.prac_17.task2;

public class EmptyStringException extends IllegalArgumentException {
    public EmptyStringException() {
        super("Enter empty string");
    }
}

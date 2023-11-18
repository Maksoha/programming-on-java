package org.example.prac_24;

public class IllegalTableNumber extends RuntimeException {
    public IllegalTableNumber(String errormessage) {
        super(errormessage);
    }
}

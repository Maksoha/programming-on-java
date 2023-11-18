package org.example.prac_17.task1;

import java.math.BigInteger;

public class InnNotValidException extends Exception {

    private BigInteger innNum;

    public InnNotValidException(BigInteger inn){
        super("ИНН с номером "+ inn + " не действителен!");
        innNum = inn;
    }

}

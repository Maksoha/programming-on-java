package org.example.prac_18;

public class Calculator {
    public static <T extends Number> T sum(T a, T b) {
        T result;
        if ((a.getClass() == Integer.class) && (b.getClass() == Double.class)) {
            result = (T)(Double)(a.intValue() + b.doubleValue());
        }
        else if ((a.getClass() == Double.class) && (b.getClass() == Integer.class)) {
            result = (T)(Double)(a.doubleValue() + b.intValue());
        }
        else if ((a.getClass() == Integer.class) && (b.getClass() == Integer.class)) {
            result = (T)(Integer)(a.intValue() + b.intValue());
        }
        else if ((a.getClass() == Double.class) && (b.getClass() == Double.class)) {
            result = (T)(Double)(a.doubleValue() + b.doubleValue());
        }
        else {
            throw new RuntimeException();
        }
        return result;
    }
    public static <T extends Number> T multiply(T a, T b) {
        T result;
        if ((a.getClass() == Integer.class) && (b.getClass() == Double.class)) {
            result = (T)(Double)(a.intValue() * b.doubleValue());
        }
        else if ((a.getClass() == Double.class) && (b.getClass() == Integer.class)) {
            result = (T)(Double)(a.doubleValue() * b.intValue());
        }
        else if ((a.getClass() == Integer.class) && (b.getClass() == Integer.class)) {
            result = (T)(Integer)(a.intValue() * b.intValue());
        }
        else if ((a.getClass() == Double.class) && (b.getClass() == Double.class)) {
            result = (T)(Double)(a.doubleValue() * b.doubleValue());
        }
        else {
            throw new RuntimeException();
        }
        return result;
    }
    public static <T extends Number> T divide(T a, T b) {
        T result;
        if ((a.getClass() == Integer.class) && (b.getClass() == Double.class)) {
            result = (T)(Double)(a.intValue() / b.doubleValue());
        }
        else if ((a.getClass() == Double.class) && (b.getClass() == Integer.class)) {
            result = (T)(Double)(a.doubleValue() / b.intValue());
        }
        else if ((a.getClass() == Integer.class) && (b.getClass() == Integer.class)) {
            result = (T)(Integer)(a.intValue() / b.intValue());
        }
        else if ((a.getClass() == Double.class) && (b.getClass() == Double.class)) {
            result = (T)(Double)(a.doubleValue() / b.doubleValue());
        }
        else {
            throw new RuntimeException();
        }
        return result;
    }
    public static <T extends Number> T subtraction(T a, T b) {
        T result;
        if ((a.getClass() == Integer.class) && (b.getClass() == Double.class)) {
            result = (T)(Double)(a.intValue() - b.doubleValue());
        }
        else if ((a.getClass() == Double.class) && (b.getClass() == Integer.class)) {
            result = (T)(Double)(a.doubleValue() - b.intValue());
        }
        else if ((a.getClass() == Integer.class) && (b.getClass() == Integer.class)) {
            result = (T)(Integer)(a.intValue() - b.intValue());
        }
        else if ((a.getClass() == Double.class) && (b.getClass() == Double.class)) {
            result = (T)(Double)(a.doubleValue() - b.doubleValue());
        }
        else {
            throw new RuntimeException();
        }
        return result;
    }
}

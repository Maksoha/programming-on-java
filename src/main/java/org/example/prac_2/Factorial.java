package org.example.prac_2;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        long result = calculateFactorial(n);
        System.out.println(n + "! = " + result);
    }

    public static long calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Факториал не определен для отрицательных чисел");
        }
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}


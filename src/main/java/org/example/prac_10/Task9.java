package org.example.prac_10;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        long result = countSequences(a, b);
        System.out.println(result);
    }

    public static int countSequences(int a, int b) {
        if (a > b + 1) {
            return 0;
        }
        if (a == 0 || b == 0) {
            return 1;
        }
        return countSequences(a, b - 1) + countSequences(a - 1, b - 1);
    }
}



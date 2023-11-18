package org.example.prac_10;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(reverse(n, 0));
    }

    public static int reverse(int n, int result) {
        return (n == 0) ? result : reverse(n / 10, result * 10 + n % 10);
    }

}

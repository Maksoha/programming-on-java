package org.example.prac_10;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        if (isPalindrome(word)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static boolean isPalindrome(String word) {
        if (word.length() == 1) {
            return true;
        } else {
            if (word.substring(0, 1).equals(word.substring(word.length() - 1))) {
                if (word.length() == 2) {
                    return true;
                }
                return isPalindrome(word.substring(1, word.length() - 1));
            } else {
                return false;
            }
        }
    }
}

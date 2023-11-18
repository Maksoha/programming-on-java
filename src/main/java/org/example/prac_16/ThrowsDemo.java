package org.example.prac_16;

import java.util.Scanner;

public class ThrowsDemo {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        while (true) {
            try {
                String key = myScanner.next();
                printDetails(key);
                break;
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Try again:");
            }
        }
    }

    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }

    private String getDetails(String key) throws Exception {
        if (key.isEmpty()) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }
}

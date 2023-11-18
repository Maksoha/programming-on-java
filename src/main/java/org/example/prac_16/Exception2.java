package org.example.prac_16;

import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        try {
            System.out.print("Enter an integer: ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2.0 / i);
        } catch (NumberFormatException e) {
            System.out.println("Error! Please enter integer");
        }
        finally {
            System.out.println("Finish");
        }
    }
}

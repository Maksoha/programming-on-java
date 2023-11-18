package org.example.prac_13;

import java.io.FileReader;
import java.io.IOException;

public class Task2 {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("test.txt");
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


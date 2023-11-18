package org.example.prac_13;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("test.txt", true); // true указывает, что файл будет дополняться
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите текст для добавления в файл (для завершения введите 'exit'): ");
            String input;
            while (!(input = scanner.nextLine()).equalsIgnoreCase("exit")) {
                writer.write(input + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


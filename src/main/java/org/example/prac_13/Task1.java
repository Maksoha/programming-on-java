package org.example.prac_13;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("test.txt");
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите информацию для записи в файл (для завершения введите exit): ");
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


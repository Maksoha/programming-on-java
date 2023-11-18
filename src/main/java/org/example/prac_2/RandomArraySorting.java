package org.example.prac_2;

import java.util.Arrays;
import java.util.Random;

public class RandomArraySorting {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        System.out.println("Исходный массив: " + Arrays.toString(numbers));

        Arrays.sort(numbers);

        System.out.println("Отсортированный массив: " + Arrays.toString(numbers));
    }
}


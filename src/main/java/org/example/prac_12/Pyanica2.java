package org.example.prac_12;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Pyanica2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] cards = input.split(" ");

        Queue<Integer> player1 = new LinkedList<>();
        Queue<Integer> player2 = new LinkedList<>();

        // Заполняем колоды игроков
        for (int i = 0; i < 5; i++) {
            player1.offer(Integer.parseInt(cards[i].substring(0, 1)));
            player2.offer(Integer.parseInt(cards[i + 5].substring(0, 1)));
        }

        int moves = 0;
        while (moves <= 106 && !player1.isEmpty() && !player2.isEmpty()) {
            int card1 = player1.poll();
            int card2 = player2.poll();

            if (card1 > card2) {
                player1.offer(card2);
                player1.offer(card1);
            } else {
                player2.offer(card1);
                player2.offer(card2);
            }

            moves++;

            // Вывод текущего состояния колод после хода
            // System.out.println("Player 1: " + player1);
            // System.out.println("Player 2: " + player2);
        }

        if (player1.isEmpty() && !player2.isEmpty()) {
            System.out.println("second " + moves);
        } else if (!player1.isEmpty() && player2.isEmpty()) {
            System.out.println("first " + moves);
        } else {
            System.out.println("botva");
        }
    }
}


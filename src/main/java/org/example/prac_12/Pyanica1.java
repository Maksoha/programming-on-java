package org.example.prac_12;

import java.util.Scanner;
import java.util.Stack;

public class Pyanica1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] cards = input.split(" ");

        Stack<Integer> player1 = new Stack<>();
        Stack<Integer> player2 = new Stack<>();

        // Заполняем колоды игроков
        for (int i = 0; i < 5; i++) {
            player1.push(Integer.parseInt(cards[i].substring(0, 1)));
            player2.push(Integer.parseInt(cards[i + 5].substring(0, 1)));
        }

        int moves = 0;
        while (moves <= 106 && !player1.isEmpty() && !player2.isEmpty()) {
            int card1 = player1.pop();
            int card2 = player2.pop();
            if (card1 > card2) {
                if (card1 == 9 && card2 == 0) {
                    player2.add(0, card2);
                    player2.add(0, card1);
                }
                else {
                    player1.add(0, card2);
                    player1.add(0, card1);
                }
            } else {
                if (card1 == 0 && card2 == 9) {
                    player1.add(0, card1);
                    player1.add(0, card2);
                }
                else {
                    player2.add(0, card1);
                    player2.add(0, card2);
                }
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


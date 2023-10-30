package PractWork_12.task1_Stack;

import java.util.Scanner;
import java.util.ArrayDeque;

public class DrunkardGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String player1Cards = scanner.nextLine();
        String player2Cards = scanner.nextLine();

        ArrayDeque<Integer> player1Deck = new ArrayDeque<>();
        ArrayDeque<Integer> player2Deck = new ArrayDeque<>();

        for (int i = 4; i >= 0; i--) {
            player1Deck.push(Integer.parseInt(player1Cards.substring(i, i + 1)));
            player2Deck.push(Integer.parseInt(player2Cards.substring(i, i + 1)));
        }

        int moves = 0;

        while (moves < 106) {
            int player1Card = player1Deck.pop();
            int player2Card = player2Deck.pop();

            if (player1Card > player2Card & (player1Card != 9 & player2Card != 0)) {
                player1Deck.add(player1Card);
                player1Deck.add(player2Card);
            }
            else {
                player2Deck.add(player1Card);
                player2Deck.add(player2Card);
            }

            moves++;

            if (player1Deck.isEmpty()) {
                System.out.println("second " + moves);
                return;
            } else if (player2Deck.isEmpty()) {
                System.out.println("first " + moves);
                return;
            }
        }

        System.out.println("botva");
    }
}

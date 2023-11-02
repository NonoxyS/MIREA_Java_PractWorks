package PractWork_12;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class DrunkardGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String player1Cards = scanner.nextLine();
        String player2Cards = scanner.nextLine();

        Queue<Integer> player1Deck = new LinkedList<>();
        Queue<Integer> player2Deck = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            player1Deck.offer(Integer.parseInt(player1Cards.substring(i, i + 1)));
            player2Deck.offer(Integer.parseInt(player2Cards.substring(i, i + 1)));
        }

        int moves = 0;

        while (moves < 106) {
            int player1Card = player1Deck.remove();
            int player2Card = player2Deck.remove();

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

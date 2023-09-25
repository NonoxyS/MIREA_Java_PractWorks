package PractWork_2.task9;


import java.util.Arrays;
import java.util.Random;

public class Poker {
    private static final String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    //private static final String[] suits = {"\u2660", "\u2661", "\u2666", "\u2663"};
    private static final String[] suits = {"-PIKI", "-4EPBI", "-TPEFU", "-BUBHU"};
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println();
        String[] deck = createDeck();
        shuffleDeck(deck);
        dealCards(deck, n);
    }

    private static String[] createDeck()
    {
        String[] deck = new String[52];
        int i = 0;
        for (String suit : suits)
        {
            for (String rank : ranks)
            {
                deck[i] = rank + suit;
                i++;
            }
        }
        return deck;
    }

    private static void shuffleDeck(String[] deck)
    {
        Random random = new Random();

        for (int i = deck.length - 1; i > 0; i--)
        {
            int j = random.nextInt(i + 1);
            String temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }
    }

    private static void dealCards(String[] deck, int n)
    {
        int numPlayers = Math.min(n, 52 / 5);
        for (int i = 0; i < numPlayers; i++)
        {
            String[] hand = Arrays.copyOfRange(deck, i * 5, (i + 1) * 5);
            for (String card : hand)
            {
                System.out.print(card + " ");
            }
            System.out.println("\n");
        }
    }
}

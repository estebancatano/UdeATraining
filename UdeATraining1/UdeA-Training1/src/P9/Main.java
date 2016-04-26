package P9;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String card;
        Deque cards;
        Deque hand;
        int cases;
        int x;
        int y;
        char c;
        cases = Integer.parseInt(lector.nextLine());
        for (int i = 1; i <= cases; i++) {
            cards = new ArrayDeque();
            hand = new ArrayDeque();
            for (int j = 0; j < 52; j++) {
                cards.addLast(lector.next());
            }
            for (int j = 0; j < 25; j++) {
                hand.addFirst(cards.pollLast());
            }
            y = 0;
            for (int j = 0; j < 3; j++) {
                card = (String) cards.pollLast();
                c = card.charAt(0);
                if (Character.isDigit(c)) {
                    x = Integer.parseInt("" + c);
                } else {
                    x = 10;
                }
                y = y + x;
                for (int k = 0; k < 10 - x; k++) {
                    cards.pollLast();
                }
            }
            for (Object obj : hand) {
                cards.addLast(obj);
            }
            for (int j = 1; j < y; j++) {
                cards.pollFirst();
            }
            System.out.println("Case " + i +": " + cards.getFirst());
        }
    }
}

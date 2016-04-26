package P4;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int b;
        int s;
        int cases;
        List bachelors;
        List spinsters;
        b = lector.nextInt();
        s = lector.nextInt();
        cases = 0;
        while (b != 0 && s != 0) {
            cases = cases + 1;
            spinsters = new LinkedList();
            bachelors = new LinkedList();
            for (int i = 0; i < b; i++) {
                bachelors.add(lector.nextInt());
            }
            for (int i = 0; i < s; i++) {
                spinsters.add(lector.nextInt());
            }
            if (b <= s) {
                System.out.println("Case " + cases + ": 0");
            } else {
                int min = (int) Collections.min(bachelors);
                System.out.println("Case " + cases + ": " + (b - s) + " " + min);
            }
            b = lector.nextInt();
            s = lector.nextInt();
        }
    }

}

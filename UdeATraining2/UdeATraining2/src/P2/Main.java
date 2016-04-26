package P2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int n;
        long g;
        n = lector.nextInt();
        while (n > 0) {
            g = 0;
            for (int i = 1; i < n; i++) {
                for (int j = i + 1; j <= n; j++) {
                    g += GCD(i, j);
                }
            }
            System.out.println(g);
            n = lector.nextInt();
        }
    }

    private static int GCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return GCD(b, a % b);
    }
}

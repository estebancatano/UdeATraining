package P3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int count;
        int j;
        int k;
        double x;
        double x1;
        double x2;
        int num;
        int den;
        double fin;
        int mcd;
        String line;
        j = lector.nextInt();
        count = 0;
        while (j != -1) {
            count = count + 1;
            line = lector.next();
            k = line.substring(line.indexOf(".") + 1).length() - j;
            x = Double.parseDouble(line);
            if (j == 0) {
                num = (int) (x * Math.pow(10, k));
                den = (int) Math.pow(10, k);
            } else {
                fin = Double.parseDouble("0." + line.substring(2 + k));
                x1 = (Math.pow(10, k + j) * x) + fin;
                x2 = Math.pow(10, k) * x;
                num = (int) (x1 - x2);
                den = (int) (Math.pow(10, k + j) - Math.pow(10, k));
            }
            mcd = GCD(num, den);
            System.out.println("Case " + count + ": " + (num / mcd) + "/" + (den / mcd));
            j = lector.nextInt();
        }
    }

    private static int GCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return GCD(b, a % b);
    }
}

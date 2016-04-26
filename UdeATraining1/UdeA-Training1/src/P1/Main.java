package P1;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int n;
        int d;
        int r;
        int sum;
        long pay;
        List morning;
        List evening;
        n = lector.nextInt();
        d = lector.nextInt();
        r = lector.nextInt();
        while (n != 0 && d != 0 && r != 0) {
            morning = new LinkedList();
            evening = new LinkedList();
            pay = 0;
            for (int i = 0; i < n; i++) {
                morning.add(lector.nextInt());
            }
            for (int i = 0; i < n; i++) {
                evening.add(lector.nextInt());
            }
            Collections.sort(morning);
            Collections.sort(evening);
            for (int i = 0; i < n; i++) {
                sum = (int)morning.get(i) + (int)evening.get(n - i - 1);
                if(sum > d){
                    pay = pay + ((sum - d)*r);
                }
            }
            System.out.println(pay);
            n = lector.nextInt();
            d = lector.nextInt();
            r = lector.nextInt();
        }
    }

}

package P2;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int h;
        int u;
        int d;
        int f;
        int day;
        double climb;
        double factor;
        double distance;
        boolean end;
        List values;
        h = lector.nextInt();
        u = lector.nextInt();
        d = lector.nextInt();
        f = lector.nextInt();
        while (h != 0) {
            climb = 0;
            day = 1;
            end = false;
            factor = (double) (u * f) / 100;
            distance = u;
            while (!end) {
                climb = climb + distance;
                if (climb > h) {
                    System.out.println("success on day " + day);
                    end = true;
                } else {
                    climb = climb - d;
                    if (climb < 0) {
                        System.out.println("failure on day " + day);
                        end = true;
                    }
                    distance = distance - factor;
                    if (distance <= 0) {
                        distance = 0;
                    }               
                    day = day + 1;
                }
            }
            h = lector.nextInt();
            u = lector.nextInt();
            d = lector.nextInt();
            f = lector.nextInt();
        }
    }

}

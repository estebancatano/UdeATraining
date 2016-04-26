package P11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int t;
        int n;
        int aux;
        int aux1;
        int highJumps;
        int lowJumps;
        List<Integer> walls;
        t = lector.nextInt();
        for (int i = 1; i <= t; i++) {
            n = lector.nextInt();
            walls = new ArrayList();
            highJumps = 0;
            lowJumps = 0;
            for (int j = 0; j < n; j++) {
                walls.add(lector.nextInt());
            }
            for (int j = 0; j < n - 1; j++) {
                aux = walls.get(j);
                aux1 = walls.get(j + 1);
                if(aux < aux1){
                    highJumps = highJumps + 1;
                }else if(aux > aux1){
                    lowJumps = lowJumps + 1;
                }
            }
            System.out.println("Case " + i + ": " + highJumps + " " + lowJumps);
        }
    }
}

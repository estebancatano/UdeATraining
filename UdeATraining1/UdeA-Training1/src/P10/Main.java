package P10;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int n;
        int aux;
        Deque<Integer> cola;
        n = lector.nextInt();
        while(n != 0){
            cola = new ArrayDeque<>();
            for (int i = 1; i <= n; i++) {
                cola.addLast(i);
            }
            System.out.print("Discarded cards:");
            while(cola.size() > 1){
                aux = cola.pollFirst();
                System.out.print(" "+aux);
                aux = cola.pollFirst();
                cola.addLast(aux);
                if(cola.size() > 1){
                    System.out.print(",");
                }
            }
            System.out.println("");
            aux = cola.pollFirst();
            System.out.println("Remaining card: " +  aux);
            n = lector.nextInt();
        }
    }

}

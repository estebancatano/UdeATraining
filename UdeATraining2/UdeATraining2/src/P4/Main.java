package P4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class Main {

    static int tama;
    static BitSet esPrimoBs;
    static List<Integer> primos;

    public static void main(String[] args) throws IOException {

        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer texto;
        long n;
        long nReverse;
        String ent;
        procesarCriba(1000000);
        while ((ent = lector.readLine()) != null) {
            texto = new StringBuffer(ent);
            n = Integer.parseInt(texto.toString());
            if (esPrimo(n)) {
                nReverse = Integer.parseInt(texto.reverse().toString());
                if (n != nReverse) {
                    if (esPrimo(Integer.parseInt(texto.toString()))) {
                        System.out.println(n + " is emirp.");
                    } else {
                        System.out.println(n + " is prime.");
                    }
                }else{
                   System.out.println(n + " is prime.");
                }
            } else {
                System.out.println(n + " is not prime.");
            }
        }
    }

    private static boolean esPrimo(long n) {
        if (n < tama) {
            return esPrimoBs.get((int) n);
        }
        for (Integer primo : primos) {
            if ((n % primo) == 0) {
                return false;
            }
        }
        return true;
    }

    private static void procesarCriba(int limSuperior) {
        tama = limSuperior + 1;
        primos = new ArrayList<>();
        esPrimoBs = new BitSet(tama);
        esPrimoBs.set(0, tama);
        esPrimoBs.set(0, 2, false);
        for (int i = 2; i < tama; i++) {
            if (esPrimoBs.get(i)) {
                for (long j = (long) i * i; j < tama; j += i) {
                    esPrimoBs.set((int) j, false);
                }
                primos.add(i);
            }
        }
    }
}

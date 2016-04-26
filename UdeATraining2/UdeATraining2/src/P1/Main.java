package P1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class Main {

    static int con;
    static int tama;
    static BitSet esPrimoBs;
    static List<Integer> primos;

    public static void main(String[] args) throws IOException {

        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer texto;
        String[] spl;
        int n;
        int c;
        int cp;
        int t;
        int x;
        int ini;
        int fin;
        String ent;
        procesarCriba(1000000);
        while ((ent = lector.readLine()) != null) {
            spl = ent.split(" ");
            con = 0;
            n = nextInt(spl);
            c = nextInt(spl);
            if (n != 0 && c != 0) {
                procesarCriba(n);
                t = primos.size();
                System.out.print(n + " " + c + ": ");
                if ((t % 2) == 0) {
                    cp = c * 2;
                } else {
                    cp = (c * 2) - 1;
                }
                x = t - cp;
                if (cp < t) {
                    ini = (x / 2) + 1;
                    fin = (t - (x / 2));
                } else {
                    ini = 1;
                    fin = t;
                }
                for (int i = ini; i <= fin; i++) {
                    System.out.print(primos.get(i - 1));
                    if (i < fin) {
                        System.out.print(" ");
                    } else {
                        System.out.println("");
                    }
                }
                System.out.println("");
            }
        }
    }

    private static int nextInt(String[] arreglo) {
        int retorno = 0;
        boolean b = false;
        while (con < arreglo.length && !b) {
            if (!arreglo[con].equals("")) {
                retorno = Integer.parseInt(arreglo[con]);
                b = true;
            }
            con = con + 1;
        }
        return retorno;
    }

    private static void procesarCriba(int limSuperior) {
        tama = limSuperior + 1;
        primos = new ArrayList<>();
        esPrimoBs = new BitSet(tama);
        esPrimoBs.set(0, tama);
        esPrimoBs.set(0, false);
        esPrimoBs.set(1, true);
        primos.add(1);
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

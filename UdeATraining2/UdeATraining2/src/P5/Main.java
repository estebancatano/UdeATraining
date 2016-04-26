package P5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        BigInteger serie;
        BigInteger A;
        BigInteger I;
        int n;
        int a;
        int c;
        boolean b;
        String ent;
        String[] spl;
        while ((ent = lector.readLine()) != null) {
            spl = ent.split(" ");
            b = false;
            c = 0;
            n = 0;
            while (c < spl.length && !b) {
                if (!spl[c].equals("")) {
                    n = Integer.parseInt(spl[c]);
                    b = true;
                }
                c = c + 1;
            }
            serie = new BigInteger("0");
            b = false;
            A = null;
            while (c < spl.length && !b) {
                if (!spl[c].equals("")) {
                    A = new BigInteger(spl[c]);
                    b = true;
                }
                c = c + 1;
            }
            for (int i = 1; i <= n; i++) {
                I = new BigInteger(Integer.toString(i));
                serie = serie.add(I.multiply(A.pow(i)));
            }
            System.out.println(serie.toString());
        }
    }
}

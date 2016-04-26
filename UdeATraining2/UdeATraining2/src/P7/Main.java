package P7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        int n;
        String[] spl;
        BigInteger p;
        BigInteger q;
        BigInteger mcd;
        n = Integer.parseInt(lector.readLine());
        for (int i = 0; i < n; i++) {
            spl = lector.readLine().split("/");
            p = new BigInteger(spl[0].trim());
            q = new BigInteger(spl[1].trim());
            mcd = p.gcd(q);
            System.out.println(p.divide(mcd).toString() + " / " + q.divide(mcd).toString());
        }
    }
}

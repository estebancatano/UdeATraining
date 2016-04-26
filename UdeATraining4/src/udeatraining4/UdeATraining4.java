/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udeatraining4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UdeATraining4 {

    static long[][] mat;

    public static void main(String[] args){
        try {
            mat = new long[1001][2001];
            Reader.init(System.in);
            int large;
            int small;
            large = Reader.nextInt();
            small = Reader.nextInt();
            while(large != 0 || small != 0){
                System.out.println(back(large, small));
                large = Reader.nextInt();
                small = Reader.nextInt();
            }
        } catch (IOException ex) {
            
        }
    }
    public static long back(int l, int s) {
        if (l < 0 || s < 0) {
            return 0;
        }
        if (mat[l][s] != 0) {
            return mat[l][s];
        }
        mat[l][s] = (back(l - 1, s + 1) + back(l, s - 1) + 1) % 9999959999L;
        return mat[l][s];
    }

}
class Reader {
    static BufferedReader reader;
    static StringTokenizer tokenizer;
    static void init(InputStream input) {
        reader = new BufferedReader(
                new InputStreamReader(input));
        tokenizer = new StringTokenizer("");
    }
    static String next() throws IOException {
        while (!tokenizer.hasMoreTokens()) {
            //TODO add check for eof if necessary
            tokenizer = new StringTokenizer(
                    reader.readLine());
        }
        return tokenizer.nextToken();
    }
    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }
    static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }
}

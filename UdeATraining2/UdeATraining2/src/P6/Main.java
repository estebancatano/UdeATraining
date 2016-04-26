package P6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        long n;
        
        while((n = Integer.parseInt(lector.readLine())) > -1){
            System.out.println(Long.toString(n, 3));
        }
    }
}

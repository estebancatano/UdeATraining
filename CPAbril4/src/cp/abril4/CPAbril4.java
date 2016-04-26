/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cp.abril4;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

/**
 *
 * @author esteban.catanoe
 */
public class CPAbril4 {

    int tamaño;
    BitSet esPrimoBs;
    List<Integer> primos;
            
    public static void main(String[] args) {
        // TODO code application logic here
        
        
    }
    
    private boolean esPrimo(long n){
        if(n < tamaño){
            return esPrimoBs.get((int) n);
        }
        for (int i = 0; i < primos.size(); i++) {
            if ((n % primos.get(i)) == 0){
                return false;
            }
        }
        return true;
    }
    
    private void procesarCriba(int limSuperior){
        tamaño = limSuperior + 1;
        primos = new ArrayList<>();
        esPrimoBs = new BitSet(tamaño);
        esPrimoBs.set(0,tamaño);
        esPrimoBs.set(0,2,false);
        for (int i = 2; i < tamaño; i++) {
            if(esPrimoBs.get(i)){
                for (long j = i * i; j < tamaño; j+=i) {
                    esPrimoBs.set((int) j, false);
                }
                primos.add(i);
            }
        }
    }
    
    private int GCD(int a, int b){
        if(b == 0){
            return a;
        }
        return GCD(b,a%b);
    }
    
    private int LCM(int a, int b){
        return a * (b/GCD(a,b));
    }
}

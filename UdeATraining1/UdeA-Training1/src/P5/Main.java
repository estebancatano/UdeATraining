package P5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int l;
        int n;
        String[] split;
        List<Character> vocals = new ArrayList();
        List<Character> lastLetter = new ArrayList();
        List<String> last2Letter = new ArrayList();
        List<String> singular = new ArrayList();
        List<String> plural = new ArrayList();
        List<String> words = new ArrayList();
        vocals.add('a');
        vocals.add('e');
        vocals.add('i');
        vocals.add('o');
        vocals.add('u');
        lastLetter.add('o');
        lastLetter.add('s');
        lastLetter.add('x');
        last2Letter.add("ch");
        last2Letter.add("sh");
        l = lector.nextInt();
        n = lector.nextInt();
        lector.nextLine();
        for (int i = 0; i < l; i++) {
            split = lector.nextLine().split(" ");
            singular.add(split[0]);
            plural.add(split[1]);
        }
        for (int i = 0; i < n; i++) {
            words.add(lector.nextLine());
        }
        words.stream().forEach((word) -> {
            if(singular.contains(word)){
                System.out.println(plural.get(singular.indexOf(word)));
            }else{
                if((Character.compare(word.charAt(word.length() - 1),'y') == 0)
                        && !vocals.contains(word.charAt(word.length() - 2))){
                    System.out.println(word.substring(0, word.length() - 1) + "ies");
                } else {
                    if(lastLetter.contains(word.charAt(word.length()-1)) || 
                            last2Letter.contains(word.substring(word.length() - 2, 
                                    word.length()))){
                        System.out.println(word + "es");
                    }else{
                        System.out.println(word + "s");
                    }
                }
            }
        });
    }

}

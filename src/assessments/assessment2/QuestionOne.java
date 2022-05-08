package assessments.assessment2;

import java.lang.reflect.Array;
import java.util.Scanner;

public class QuestionOne {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        String remove = in.nextLine();
//        String word = "alive is awesome";//testing code
//        String remove = "alwsr";//testing code
        removeStrings(word, remove);
    }

    public static void removeStrings(String word, String remove){
        String[] removeArray = remove.split("");
        for (String s: removeArray){
            word = word.replaceAll(s, "");
        }
        System.out.println(word);
    }
}

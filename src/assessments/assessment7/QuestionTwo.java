package assessments.assessment7;

import java.util.Arrays;
import java.util.Scanner;

public class QuestionTwo {
    public static void main(String[] args) {
        System.out.println("Input 1");
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        int counter = Integer.parseInt(str1);
        String[] array = new String[counter];
        for(int i=0; i<counter; i++){
            String str = in.nextLine();
            array[i] = str;
        }
        Arrays.sort(array);
        for (String str : array) System.out.println(str);
    }
}

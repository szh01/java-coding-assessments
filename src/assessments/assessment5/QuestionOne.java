package assessments.assessment5;

import java.util.Scanner;

public class QuestionOne {
    public static void main(String[] args) {
        System.out.println("Input 1");
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        try {
            int number1 = Integer.parseInt(str1);
            int number2 = Integer.parseInt(str2);
            System.out.println(number1+number2);
        }catch (NumberFormatException e){
            e.printStackTrace();
        }


    }
}

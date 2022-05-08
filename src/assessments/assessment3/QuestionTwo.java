package assessments.assessment3;

import java.util.Scanner;

public class QuestionTwo {
    public static void main(String[] args) {
        System.out.println("Input 1");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int number = Integer.parseInt(str);
        int result = (int) Math.pow(number, 3);
        System.out.println("cube of "+ number +" is " + result);
    }
}

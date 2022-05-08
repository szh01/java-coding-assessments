package assessments.assessment6;

import java.util.Scanner;

public class QuestionTwo {
    public static void main(String[] args) {
        System.out.println("Input 1");
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String[] array = str1.split(" ");
        int num1 = Integer.parseInt(array[0]);
        int num2 = Integer.parseInt(array[1]);
        try {
            int result  = num1/num2;
            System.out.println(result);
        }catch (ArithmeticException e){
            e.printStackTrace();
        }

    }
}

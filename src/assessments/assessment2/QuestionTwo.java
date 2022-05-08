package assessments.assessment2;

import java.util.Scanner;

public class QuestionTwo {
    public static void main(String[] args) {
        System.out.println("Input 1");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int number = Integer.parseInt(str);
        System.out.println("Output 1");
        constructMatrix(number);
    }
    public static void constructMatrix(int number){
        for (int i = 0; i<number; i++){
            for (int j=0; j<number; j++){
                if(j==i)
                    System.out.print("1 ");
                else
                System.out.print("0 ");
            }
            System.out.println();
        }
    }
}

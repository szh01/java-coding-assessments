package assessments.assessment4;

import java.util.Scanner;

public class QuestionOne {
    public static void main(String[] args) {
        System.out.println("Input 1");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int number = Integer.parseInt(str);
        switch (number) {
            case 1:
                System.out.println("The entered month is in the Winter");
                break;
            case 2:
                System.out.println("The entered month is in the Summer");
                break;
            case 3:
                System.out.println("The entered month is in the Summer");
                break;
            case 4:
                System.out.println("The entered month is in the Summer");
                break;
            case 5:
                System.out.println("The entered month is in the Summer");
                break;
            case 6:
                System.out.println("The entered month is in the Spring");
                break;
            case 7:
                System.out.println("The entered month is in the Spring");
                break;
            case 8:
                System.out.println("The entered month is in the Spring");
                break;
            case 9:
                System.out.println("The entered month is in the Spring");
                break;
            case 10:
                System.out.println("The entered month is in the Winter");
                break;
            case 11:
                System.out.println("The entered month is in the Winter");
                break;
            case 12:
                System.out.println("The entered month is in the Winter");
                break;
            default:
                System.out.println("The entered month is in the Bogus Month");
                break;
        }
    }
}

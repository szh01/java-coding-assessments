package assessments.assessment1;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Scanner;

public class QuestionTwo {
    public static void main(String[] args) throws ParseException {
        System.out.println("Input 1");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println("Output 1");
//        String str = "1234.56";//hardcode for testing
        Double dStr = Double.parseDouble(str);
        outputFormats(dStr);
    }

    public static void outputFormats(double value){
        System.out.println("Without fraction part "+ formating("######", value));
        System.out.println("Formatted to give precision " + formating("#.##", value));
        System.out.println("Appended zeroes to right "  + formating("#.000000", value));
        System.out.println("Formatting numeric part 0" + formating("#.##", value));
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Formatted in dollars " + formatter.format(value));
    }

    public static String formating(String pattern, double value){
        DecimalFormat df = new DecimalFormat(pattern);
        String result = df.format(value);
        return result;
    }
}

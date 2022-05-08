package assessments.assessment1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class questionOne {
    //Practice assessment 1 question1

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String str = "empty";
        while (!str.equals("")) {
            System.out.println("enter:");
            Scanner in = new Scanner(System.in);
            str = in.nextLine();
            list.add(str);
        }
        String target = list.get(list.size()-2);//-2 instead of 1 to accomodate end input
        System.out.println(findNumber(list, target));
    }

    public static String findNumber(List<String> incomingList, String targetNumber){
        for(int i=0; i<incomingList.size(); i++){
            if (incomingList.get(i).equals(targetNumber)){
                return targetNumber+ " found at location "+i;
            }
        }
            return targetNumber + " is not found";
    }
}

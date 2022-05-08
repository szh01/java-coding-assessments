package assessments.assessment4;

public class QuestionTwo {
    public static void main(String[] args) {
        String[] array = {"one","two"};
        try{
            System.out.println(array[3]);
        }catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            arrayIndexOutOfBoundsException.printStackTrace();
        }
    }
}

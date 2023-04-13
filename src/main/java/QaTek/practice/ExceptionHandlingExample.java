package QaTek.practice;

public class ExceptionHandlingExample {

    public static void main(String[] args){

        // try-catch block
        try{
            int[] num = {1, 2, 3, 4};

            System.out.println(num[4]);
        } catch(Exception e){
            System.out.println(e);
        }



    }
}

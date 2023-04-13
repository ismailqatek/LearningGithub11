package QaTek.practice;

public class RecursionDemo {

    public static int sum(int k){

        if(k>0){
            return k + sum(k-1);
        }else{
            return 0;
        }
    }

    public static void main(String[] args){

       /* int result = 1+2;
        result += 3;
        result += 4; */

        int result = sum(10);
        System.out.println(result);

    }
}

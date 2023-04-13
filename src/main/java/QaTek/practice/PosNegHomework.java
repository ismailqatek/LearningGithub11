package QaTek.practice;

import java.util.Scanner;

public class PosNegHomework {

    public static void main(String[] args){

        System.out.println("Hello");

        Scanner intObj = new Scanner(System.in);

        System.out.println("Please enter a number : ");
        int num = intObj.nextInt();

        if(num >= 0){
            System.out.println("The number is Positive.");
        } else {
            System.out.println("The number is Negative.");
        }

        System.out.println("Thank you");
    }
}

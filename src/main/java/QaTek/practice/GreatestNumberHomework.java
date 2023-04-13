package QaTek.practice;

import java.util.Scanner;
public class GreatestNumberHomework {
    public static void main(String[] args) {

        System.out.println("Hello");

        Scanner intObj = new Scanner(System.in);

        System.out.println("Please enter the first number : ");
        int num1 = intObj.nextInt();

        System.out.println("Please enter the second number : ");
        int num2 = intObj.nextInt();

        System.out.println("Please enter the third number : ");
        int num3 = intObj.nextInt();

        if (num1 >= num2) {
            if (num1 >= num3) {
                System.out.println("The greatest number is : " + num1);
            } else {
                System.out.println("The greatest number is : " + num3);
            }
        } else if (num2 >= num3) {
            System.out.println("The greatest number is : " + num2);
        } else {
            System.out.println("The greatest number is : " + num3);
        }
            System.out.println("Thank you");
    }
}

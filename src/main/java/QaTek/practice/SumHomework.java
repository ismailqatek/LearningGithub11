package QaTek.practice;

import java.util.Scanner;
public class SumHomework {
    public void Sums(){

    System.out.println("Hello");

    Scanner intObj = new Scanner(System.in);

    System.out.println("Please enter the larger of the two numbers first : ");
    int num1 = intObj.nextInt();

    System.out.println("Please enter the smaller number : ");
    int num2 = intObj.nextInt();

        System.out.println("The results are as follows : ");

    int sum1 = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + sum1);

    int sum2 = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + sum2);

    int sum3 = num1 * num2;
        System.out.println(num1 + " X " + num2 + " = " + sum3);

    int sum4 = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + sum4);

    int sum5 = num1 % num2;
        System.out.println(num1 + " mod " + num2 + " = " + sum5);

        System.out.println("Thank you");

    }
}

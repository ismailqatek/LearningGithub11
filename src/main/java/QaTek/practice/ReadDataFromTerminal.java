package QaTek.practice;

import java.util.Scanner;
public class ReadDataFromTerminal {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String s = in.nextLine();
        System.out.println("You entered a string: " + s);

        System.out.println("Enter your age: ");
        Integer a = in.nextInt();
        System.out.println("You entered an integer: " + a);

        System.out.println("Enter your shirt price: ");
        Float p = in.nextFloat();
        System.out.println("You entered a float: " + p);
    }
}

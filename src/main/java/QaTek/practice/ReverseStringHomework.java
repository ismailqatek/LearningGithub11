package QaTek.practice;

import java.util.Scanner;
public class ReverseStringHomework {
    public void ReverseString() {

        System.out.println("Hello");

        Scanner strObj = new Scanner(System.in);

        System.out.println("Please enter a String : ");

        String originalStr = strObj.nextLine();

        String reversedStr = "";

        for (int i = 0; i < originalStr.length(); i++) {
            reversedStr = originalStr.charAt(i) + reversedStr;
        }

        System.out.println("The reverse string is : " + reversedStr);
        System.out.println("Thank you");
    }
}

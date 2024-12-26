package Assignments.first_java;

import java.util.Scanner;

public class PalindromeOfStrings {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String text = in.nextLine();

        boolean bool = true;
        for (int i = 0; i < text.length(); i++) {
            if (!(text.charAt(i) == text.charAt(text.length() - 1 - i))) {
                bool = false;
                break;
            }
        }
        if(bool) {
            System.out.println(text + " is a Palindrome.");
        } else {
            System.out.println(text + " is not a Palindrome.");
        }
    }
}

package Assignments.functions;

import java.util.Scanner;

public class PalindromeOfANumber {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = in.nextInt();

        if(isPalindrome(num)) {
            System.out.println(num + " is a Palindrome Number.");
        } else {
            System.out.println(num + " is not a Palindrome Number.");
        }
    }

    private static boolean isPalindrome(int num) {

        int palindrome = 0;

        int temp = num;

        while (temp > 0) {
            palindrome = (palindrome * 10) + (temp % 10);
            temp /= 10;
        }
        return num == palindrome;
    }
}

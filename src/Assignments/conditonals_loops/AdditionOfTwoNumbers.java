package Assignments.conditonals_loops;

import java.util.Scanner;

public class AdditionOfTwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = in.nextInt();
        System.out.print("Enter another number : ");
        int b = in.nextInt();
        System.out.println("Sum : " + (a + b));
    }
}

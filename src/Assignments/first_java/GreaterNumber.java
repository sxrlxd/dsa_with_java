package Assignments.first_java;

import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = in.nextInt();
        System.out.print("Enter another number : ");
        int b = in.nextInt();

        if (a > b) {
            System.out.println(a + " is greater");
        } else {
            System.out.println(b + " is greater");
        }
    }
}

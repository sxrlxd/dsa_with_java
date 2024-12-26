package Assignments.functions;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = in.nextInt();
        factorial(num);
    }

    private static void factorial(int num) {

        if (num < 2) {
            System.out.print(num + "! = 1");
            return;
        }

        int fact = 1;

        System.out.print(num + "! = ");
        for (int i = num; i >= 1; i--) {
            System.out.print(i + " * ");
            fact *= i;
        }
        System.out.print("\b\b= " + fact);
    }
}

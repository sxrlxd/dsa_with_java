package Assignments.first_java;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        float a = in.nextFloat();
        System.out.print("Enter another number : ");
        float b = in.nextFloat();
        System.out.print("Enter operator number : ");
        String op = in.next();

        if (op.equals("+")) {
            System.out.println("Addition : " + (a + b));
        } else if (op.equals("-")) {
            System.out.println("Addition : " + (a - b));
        } else if (op.equals("*")) {
            System.out.println("Addition : " + (a * b));
        } else if (op.equals("/")) {
            System.out.println("Addition : " + (a / b));
        }
    }
}

package Assignments.functions;

import java.util.Scanner;

public class SumOf2Numbers {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = in.nextInt();
        System.out.print("Enter another number : ");
        int b = in.nextInt();

        System.out.println("Sum : " + sum(a, b));
    }

    private static int sum(int a, int b) {

        return a + b;
    }
}

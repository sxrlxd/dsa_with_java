package Assignments.first_java;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the term number :");
        int n = in.nextInt();
        int a = 0, b = 1, fibo = 0;
        for (int i = 0; i < n; i++) {
            System.out.print(fibo + " ");
            a = b;
            b = fibo;
            fibo = a + b;
        }
    }
}

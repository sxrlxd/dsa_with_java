package Assignments.functions;

import java.util.Scanner;

public class MaximumAndMinimumOfThreeNumbers {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("input a : ");
        int a = in.nextInt();
        System.out.print("input b : ");
        int b = in.nextInt();
        System.out.print("input c : ");
        int c = in.nextInt();

        maximum(a, b, c);
        minimum(a, b, c);
    }

    private static void maximum(int a, int b, int c) {

        if (a > b && a > c) {
            System.out.println("Maximum : " + a);
        } else if (b > c) {
            System.out.println("Maximum : " + b);
        } else {
            System.out.println("Maximum : " + c);
        }
    }

    private static void minimum(int a, int b, int c) {

        if (a < b && a < c) {
            System.out.println("Minimum : " + a);
        } else if (b < c) {
            System.out.println("Minimum : " + b);
        } else {
            System.out.println("Maximum : " + c);
        }
    }

}

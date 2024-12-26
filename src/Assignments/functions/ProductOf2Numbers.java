package Assignments.functions;

import java.util.Scanner;

public class ProductOf2Numbers {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = in.nextInt();
        System.out.print("Enter another number : ");
        int b = in.nextInt();

        System.out.println("Product : " + prod(a, b));
    }

    private static int prod(int a, int b) {

        return a * b;
    }
}

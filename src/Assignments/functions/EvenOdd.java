package Assignments.functions;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("input : ");
        int num = in.nextInt();
        System.out.println(isEven(num) ? "Even" : "Odd");
    }

    private static boolean isEven(int num) {
        return (num & 1) == 0;
    }
}

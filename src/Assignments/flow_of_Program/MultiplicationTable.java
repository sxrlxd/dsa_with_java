package Assignments.flow_of_Program;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = in.nextInt();
        table(num);
    }

    private static void table(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }
}

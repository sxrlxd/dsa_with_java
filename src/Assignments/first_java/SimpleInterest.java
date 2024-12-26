package Assignments.first_java;

import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter Principal : ");
        float principal = in.nextFloat();
        System.out.print("Enter Rate : ");
        float rate = in.nextFloat();
        System.out.print("Enter Time in years : ");
        float time = in.nextFloat();

        System.out.println("Simple Interest : " + (principal*rate*time) / 100);
    }
}

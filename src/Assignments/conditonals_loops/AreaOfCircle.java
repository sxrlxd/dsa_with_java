package Assignments.conditonals_loops;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius of the circle : ");
        double radius = scanner.nextDouble();
        System.out.println("Area of Circle : " + (Math.PI * radius * radius));
    }
}


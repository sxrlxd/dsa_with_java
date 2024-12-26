package Assignments.conditonals_loops;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base of the triangle : ");
        double base = scanner.nextDouble();
        System.out.print("Enter height of the triangle : ");
        double height = scanner.nextDouble();
        System.out.println("Area of Triangle : " + (0.5 * base * height));
    }
}


package Assignments.conditonals_loops;

import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius of the circle : ");
        double radius = scanner.nextDouble();
        System.out.println("Perimeter of Circle : " + (2 * Math.PI * radius));
    }
}


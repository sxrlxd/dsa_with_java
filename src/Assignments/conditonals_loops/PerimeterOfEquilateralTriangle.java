package Assignments.conditonals_loops;

import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side length of equilateral triangle : ");
        double side = scanner.nextDouble();
        System.out.println("Perimeter of Equilateral Triangle : " + (3 * side));
    }
}

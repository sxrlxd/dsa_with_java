package Assignments.conditonals_loops;

import java.util.Scanner;

public class AreaOfIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base of the isosceles triangle : ");
        double base = scanner.nextDouble();
        System.out.print("Enter the height of the isosceles triangle : ");
        double height = scanner.nextDouble();
        System.out.println("Area of Isosceles Triangle : " + (0.5 * base * height));
    }
}

package Assignments.conditonals_loops;

import java.util.Scanner;

public class CurvedSurfaceAreaOfCylinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the cylinder : ");
        double radius = scanner.nextDouble();
        System.out.print("Enter the height of the cylinder : ");
        double height = scanner.nextDouble();
        System.out.println("Curved Surface Area of the Cylinder : " + (2 * Math.PI * radius * height));
    }
}

package Assignments.conditonals_loops;

import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius of the cylinder : ");
        double radius = scanner.nextDouble();
        System.out.print("Enter height of the cylinder : ");
        double height = scanner.nextDouble();
        System.out.println("Volume of Cylinder : " + (Math.PI * radius * radius * height));
    }
}

package Assignments.conditonals_loops;

import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius of the sphere: ");
        double radius = scanner.nextDouble();
        System.out.println("Volume of Sphere: " + ((4.0 / 3) * Math.PI * radius * radius * radius));
    }
}

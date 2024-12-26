package Assignments.conditonals_loops;

import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius of the cone : ");
        double radius = scanner.nextDouble();
        System.out.print("Enter height of the cone : ");
        double height = scanner.nextDouble();
        System.out.println("Volume of Cone : " + ((1.0 / 3) * Math.PI * radius * radius * height));
    }
}

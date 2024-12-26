package Assignments.conditonals_loops;

import java.util.Scanner;

public class VolumeOfPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter area of the base of the pyramid : ");
        double baseArea = scanner.nextDouble();
        System.out.print("Enter height of the pyramid : ");
        double height = scanner.nextDouble();
        System.out.println("Volume of Pyramid : " + ((1.0 / 3) * baseArea * height));
    }
}

package Assignments.conditonals_loops;

import java.util.Scanner;

public class VolumeOfPrism {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter area of the base of the prism : ");
        double baseArea = scanner.nextDouble();
        System.out.print("Enter height of the prism : ");
        double height = scanner.nextDouble();
        System.out.println("Volume of Prism : " + (baseArea * height));
    }
}


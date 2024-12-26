package Assignments.conditonals_loops;

import java.util.Scanner;

public class TotalSurfaceAreaOfCube {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side length of the cube : ");
        double side = scanner.nextDouble();
        System.out.println("Total Surface Area of the Cube : " + (6 * side * side));
    }
}

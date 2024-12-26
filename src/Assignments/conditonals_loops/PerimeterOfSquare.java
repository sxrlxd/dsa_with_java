package Assignments.conditonals_loops;

import java.util.Scanner;

public class PerimeterOfSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side length of the square : ");
        double side = scanner.nextDouble();
        System.out.println("Perimeter of Square : " + (4 * side));
    }
}

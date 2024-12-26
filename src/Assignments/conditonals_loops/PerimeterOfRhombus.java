package Assignments.conditonals_loops;

import java.util.Scanner;

public class PerimeterOfRhombus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side length of the rhombus : ");
        double side = scanner.nextDouble();
        System.out.println("Perimeter of Rhombus : " + (4 * side));
    }
}

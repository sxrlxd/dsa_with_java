package Assignments.conditonals_loops;

import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1st diagonal of the rhombus : ");
        double d1 = scanner.nextDouble();
        System.out.print("Enter 2nd diagonal of the rhombus : ");
        double d2 = scanner.nextDouble();
        System.out.println("Area of Rhombus : " + (0.5 * d1 * d2));
    }
}

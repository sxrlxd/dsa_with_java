package Assignments.conditonals_loops;

import java.util.Scanner;

public class PerimeterOfParallelogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of the parallelogram : ");
        double length = scanner.nextDouble();
        System.out.print("Enter breadth of the parallelogram : ");
        double breadth = scanner.nextDouble();
        System.out.println("Perimeter of Parallelogram : " + (2 * (length + breadth)));
    }
}


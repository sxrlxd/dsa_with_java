package Assignments.conditonals_loops;

import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base of the parallelogram : ");
        double base = scanner.nextDouble();
        System.out.print("Enter height of the parallelogram : ");
        double height = scanner.nextDouble();
        System.out.println("Area of Parallelogram : " + (base * height));
    }
}

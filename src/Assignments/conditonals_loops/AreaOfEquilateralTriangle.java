package Assignments.conditonals_loops;

import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side length of equilateral triangle : ");
        double side = scanner.nextDouble();
        System.out.println("Area of Equilateral Triangle : " + ((Math.sqrt(3) / 4) * side * side));
    }
}


package Assignments.conditonals_loops;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of the rectangle : ");
        double length = scanner.nextDouble();
        System.out.print("Enter width of the rectangle : ");
        double width = scanner.nextDouble();
        System.out.println("Area of Rectangle : " + length * width);
    }
}


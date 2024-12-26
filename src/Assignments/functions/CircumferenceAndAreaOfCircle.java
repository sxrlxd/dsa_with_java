package Assignments.functions;

import java.util.Scanner;

public class CircumferenceAndAreaOfCircle {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of the circle : ");
        float r = in.nextFloat();
        circumference(r);
        area(r);
    }

    private static void circumference(float r) {
        System.out.println("Circumference of the Circle : " + (2 * Math.PI * r));
    }
    private static void area(float r) {
        System.out.println("Area of the Circle : " + (Math.PI * r * r));
    }
}

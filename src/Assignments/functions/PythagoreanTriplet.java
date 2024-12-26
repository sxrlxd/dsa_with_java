package Assignments.functions;

import java.util.Scanner;

public class PythagoreanTriplet {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter side a : ");
        int a = in.nextInt();
        System.out.print("Enter side b : ");
        int b = in.nextInt();
        System.out.print("Enter side c : ");
        int c = in.nextInt();
        if (isTriplet(a, b, c)) {
            System.out.printf("%d, %d, %d are Pythagorean Triplet.", a, b, c);
        } else {
            System.out.printf("%d, %d, %d are not Pythagorean Triplet.", a, b, c);
        }
    }
    private static boolean isTriplet(int a, int b, int c) {
        int sa = a * a;
        int sb = b * b;
        int sc = c * c;
        if (sa == sb + sc) {
            return true;
        } else if (sb == sa + sc) {
            return true;
        } else return sc == sa + sb;
    }
}

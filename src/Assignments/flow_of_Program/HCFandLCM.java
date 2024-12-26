package Assignments.flow_of_Program;

import java.util.Scanner;

public class HCFandLCM {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = in.nextInt();
        System.out.print("Enter another number : ");
        int b = in.nextInt();
        System.out.println("LCM : " + lcm(a, b));
        System.out.println("HCF : " + hcf(a, b));
    }
    private static int lcm(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        return Math.abs(a * b) / hcf(a,b);
    }
    private static int hcf(int a, int b) {
        // need time!!!
        return  0;
    }
}

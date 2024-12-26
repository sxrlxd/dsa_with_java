package Assignments.first_java;

import java.util.Scanner;

public class ArmstrongBetween2Numbers {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Start : ");
        int start = in.nextInt();
        System.out.print("End : ");
        int end = in.nextInt();

        for (int i = start; i <= end; i++) {
            if (i < 10) {
                System.out.println(i + " is an Armstrong Number.");
                continue;
            }
            int temp = i, p = (int) Math.log10(i) + 1, arms = 0;
            int l;
            while (temp > 0) {
                l = temp % 10;
                arms += (int) Math.pow(l, p);
                temp /= 10;
            }
            if (arms == i) {
                System.out.println(i + " is an Armstrong Number.");
            }
        }
    }
}

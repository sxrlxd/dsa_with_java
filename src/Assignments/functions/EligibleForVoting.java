package Assignments.functions;

import java.util.Scanner;

public class EligibleForVoting {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = in.nextInt();
        if(isEligible(age)) {
            System.out.println("You are eligible of Voting.");
        } else {
            System.out.println("You are not eligible of Voting.");

        }
    }
    private static boolean isEligible(int age) {
        return age >= 18;
    }
}

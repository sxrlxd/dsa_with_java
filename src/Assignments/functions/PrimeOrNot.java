package Assignments.functions;

import java.util.Scanner;

public class PrimeOrNot {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = in.nextInt();
        if (num == 1) {
            System.out.println("1 is neither Prime nor Composite.");
        } else {
            if (isPrime(num)) {
                System.out.println(num + " is a Prime number.");
            } else {
                System.out.println(num + " is not a Prime number.");
            }
        }
    }

    private static boolean isPrime(int num) {
        if (num < 1) {
            return false;
        }
        for (int i = 2; i*i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

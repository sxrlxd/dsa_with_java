package Assignments.functions;

import java.util.Scanner;

public class PrimeNumbersBetween2Numbers {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Start : ");
        int start = in.nextInt();
        System.out.print("End : ");
        int end = in.nextInt();

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isPrime(int num) {
        if (num < 2) {
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

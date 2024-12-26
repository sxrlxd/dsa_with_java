package Assignments.functions;

import java.util.Scanner;

public class SumOfFirstNNaturalNumbers {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter nth term : ");
        int n = in.nextInt();
        System.out.println(sum(n));
    }

    private static int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}

package Assignments.conditonals_loops;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 0;
        int b = 1;
        int fibo = 0;
        for (int i = 0; i < n; i++) {
            System.out.print(fibo + " ");
            a = b;
            b = fibo;
            fibo = a + b;
        }
    }
}

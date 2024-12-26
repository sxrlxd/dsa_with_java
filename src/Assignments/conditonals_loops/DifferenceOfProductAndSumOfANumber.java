package Assignments.conditonals_loops;

import java.util.Scanner;

public class DifferenceOfProductAndSumOfANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scanner.nextInt();
        int product = 1, sum = 0;
        while (num > 0) {
            product *= num % 10;
            sum += num % 10;
            num /= 10;
        }
        System.out.println(product - sum);
    }
}


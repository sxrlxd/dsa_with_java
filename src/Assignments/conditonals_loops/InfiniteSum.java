package Assignments.conditonals_loops;

import java.util.Scanner;

public class InfiniteSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int num;
        System.out.println("Enter 0 to quit.");
        while(true) {
            System.out.print("Enter a number : ");
            num = scanner.nextInt();
            if (num == 0) break;
            sum += num;
        }
        System.out.println("Sum : " + sum);
    }

}

package Assignments.conditonals_loops;

import java.util.Scanner;

public class Greater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int greater = 0;
        int num;
        System.out.println("Enter 0 to quit.");
        while(true) {
            System.out.print("Enter a number : ");
            num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            if (num > greater) {
                greater = num;
            }
        }
        System.out.println("Greatest Number : " + greater);
    }
}

package Assignments.flow_of_Program;

import java.util.Scanner;

public class InfiniteSum {

    public static void main(String[] args) {
        System.out.println(sum());
    }

    private static int sum() {

        Scanner in = new Scanner(System.in);

        int sum = 0;
        int num = 0;
        System.out.println("Enter 0 to quit.");
        while(true) {
            System.out.print("Enter a number : ");
            num = in.nextInt();
            if (num == 0) break;
            sum += num;
        }
        return sum;
    }
}

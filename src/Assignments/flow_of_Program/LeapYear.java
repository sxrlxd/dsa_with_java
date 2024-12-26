package Assignments.flow_of_Program;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int year = in.nextInt();
        System.out.println(year + " is" + (isLeap(year) ? "" : " not") + " a Leap Year");
    }

    private static boolean isLeap(int year) {

        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}

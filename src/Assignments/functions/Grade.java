package Assignments.functions;

import java.util.Scanner;

public class Grade {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter your marks : ");
        int marks = in.nextInt();
        userGrade(marks);
    }

    private static void userGrade(int marks) {

        if (marks > 100 || marks < 0) {
            System.out.println("0 <= Marks <= 100");
            return;
        }
        if (marks > 90) {
            System.out.println("AA");
        } else if (marks > 80) {
            System.out.println("AB");
        } else if (marks > 70) {
            System.out.println("BB");
        } else if (marks > 60) {
            System.out.println("BC");
        } else if (marks > 50) {
            System.out.println("CD");
        } else if (marks > 40) {
            System.out.println("DD");
        } else {
            System.out.println("Fail");
        }
    }

}

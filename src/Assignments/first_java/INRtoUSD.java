package Assignments.first_java;

import java.util.Scanner;

public class INRtoUSD {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter Rupees : ");
        double rup = in.nextDouble();
        System.out.println(rup + " in USD : " + (rup/85.40));
    }
}

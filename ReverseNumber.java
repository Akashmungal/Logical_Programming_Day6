package com.bridgelabz;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number To Find Reverse ");
        int num = scan.nextInt();
        int reverse = 0;
        int rem = 0;

        while (num != 0) {

            rem = num % 10;
            reverse = reverse * 10 + rem;
            num = num / 10;
        }
        System.out.println(" Reverse Number is " + num);

    }
}

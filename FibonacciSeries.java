package com.bridgelabz;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter count to print fibonacci");
        int count = scan.nextInt();

        int a = 0, b = 1, c;

        System.out.println(a + " " + b);
        for(int i = 1; i < count; i ++) {

            c = a + b;
            System.out.println(" " + c);

            a = b;
            b = a;

        }

    }
}

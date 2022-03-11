package com.bridgelabz;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number to check Prime or Not ");
        int num = scan.nextInt();
        int prime = 1;

        for (int i = 2; i < num; i++){
            if(num % i == 0){
                System.out.println("It is not a Prime Number");
                prime = 0;
            }
            if(prime == 1)
            {
                System.out.println("It is a Prime Number");
            }
        }
    }
}

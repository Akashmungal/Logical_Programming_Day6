package com.bridgelabz;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number for check Perfect");
        int num = scan.nextInt();

        int sum = 0;
        int i = 1;
        while (i <= num/2) {
            if (num % i == 0) {
                sum = sum + i;
            }
                i++;
            }
                if(sum == num)
                {
                    System.out.println(num+ " It is Perfect Number");
                }
                else
                {
                    System.out.println(num+ " It is not Perfect Number");
                }
    }

}

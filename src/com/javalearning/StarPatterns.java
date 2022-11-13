package com.javalearning;

import java.util.Scanner;

public class StarPatterns {
    public static void main(String[] args) {
        System.out.println("How many stars?");
        Scanner s = new Scanner(System.in);
        int stars = s.nextInt();
        for (int row = 1; row <= stars; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int row = stars-1; row > 0; row --) {
            for (int col = 0; col < row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

package com.javalearning;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final byte MonthsInYear = 12;
        final byte percent = 100;
        int principal;
        float monthlyInterest;
        int paymentMonths;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Principal: ");
            int principalInput = scanner.nextInt();
            if (principalInput >= 1000 && principalInput <= 100_000) {
                principal = principalInput;
                break;
            }
            System.out.println("Enter a number between 1,000 and 100,000");
        }
        while (true) {
            System.out.print("Annual Interest Rate: ");
            float annualInterestInput = scanner.nextFloat();
            if (annualInterestInput > 0 && annualInterestInput <= 30) {
                monthlyInterest = (annualInterestInput / 100) / 12;
                break;
            }
            System.out.println("Enter a value greater than 0 and less than or equal to 30");
        }
        while (true) {
            System.out.print("Period (Years): ");
            int paymentYearsInput = scanner.nextInt();
            if (paymentYearsInput > 1 && paymentYearsInput < 31) {
                paymentMonths = paymentYearsInput * 12;
                break;
            }
            System.out.println("Enter a value between 1 and 31");
        }
        double mortgage = principal * ((monthlyInterest * (Math.pow((1 + monthlyInterest), paymentMonths)) ) / ((Math.pow((1 + monthlyInterest), paymentMonths)) - 1));

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("\n" + "Principal: " + principal + "\n" + "Monthly Interest Rate: " + monthlyInterest + "\n" + "Period (Months): " + paymentMonths + "\n" + "Mortgage: " + mortgageFormatted);
    }
}
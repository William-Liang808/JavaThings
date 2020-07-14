package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Principle (1K - 1M): ");
        int principle = scanner.nextInt();
	    while (principle < 1_000 || principle >100_000_000) {
            System.out.println("Enter a number between 1,000 and 1,000,000.");
            System.out.println("Principle (1K - 1M): ");
            principle = scanner.nextInt();
            System.out.println(principle);
	    }

        System.out.println("Annual Interest Rate: ");
	    float annualInterestRate = scanner.nextFloat();
	    while (annualInterestRate < 0 || annualInterestRate >= 30){
            System.out.println("Enter a value greater than and less than or equal to 30.");
            System.out.println("Annual Interest Rate: ");
            annualInterestRate = scanner.nextFloat();
            System.out.println(annualInterestRate);
        }
	    float monthlyInterest = annualInterestRate / PERCENT / MONTHS_IN_YEAR;

        System.out.println("Period (Years): ");
	    byte period = scanner.nextByte();
	    while (period < 1 || period > 30) {
            System.out.println("Enter a number between 1 and 30.");
            System.out.println("Period (Years): ");
            period = scanner.nextByte();
            System.out.println(period);
        }
	    int numberOfPayments = period * MONTHS_IN_YEAR;

	    //Mortgage:
        double monthlyMortgage = principle
                *(monthlyInterest*Math.pow((1+monthlyInterest),numberOfPayments))
                /(Math.pow(monthlyInterest + 1, numberOfPayments) - 1);
	    double annualMortgage = monthlyMortgage * MONTHS_IN_YEAR;

        String monthlyMortgageFormatted = NumberFormat.getCurrencyInstance().format(monthlyMortgage);
        String annualMortgageFormatted = NumberFormat.getCurrencyInstance().format(annualMortgage);
        System.out.println("Monthly mortgage payment: " + monthlyMortgageFormatted);
        System.out.println("Annual mortgage payment: " + annualMortgageFormatted);
    }
}

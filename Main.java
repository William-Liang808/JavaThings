package com.company;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Declares important final integers and Scanner input
	    final byte MONTHS_IN_YEAR = 12;
	    final byte PERCENT = 100;
	    Scanner scanner = new Scanner(System.in);

        //User input for principle
        System.out.println("Principle: ");
        //Stores user input for principle in integer variable 'principle'
        int principle = scanner.nextInt();

        //User input for annual interest rate
        System.out.println("Annual Interest Rate: ");
        //Stores user input for annual interest rate in float variable 'annualInterest'. We use float since double seems too large for a percent that won't be too large.
        float annualInterest = scanner.nextFloat();
        //Multiplies annual interest, divides it by PERCENT (100), and divides by MONTHS_IN_YEAR (12), to fit the mortgage calculator format.
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        //User input for period in years
        System.out.println("Period (Years): ");
        //Stores user input for period in byte variable 'years' since bytes hold integers up to 32 and mortgages typically go to about 30 years.
        byte years = scanner.nextByte();
        //Multiplies 'years' by MONTHS_IN_YEAR (12) to obtain the number of payments in months for the mortgage calculator format.
        int numberOfPayments = years * MONTHS_IN_YEAR;

        //Putting together all the integers / variables we declared into the mortgage calculator format.
        double monthlyMortgage = principle
                *(monthlyInterest*Math.pow((1+monthlyInterest), numberOfPayments))
                /(Math.pow(monthlyInterest + 1, numberOfPayments) - 1);
        //Multiplies 'monthlyMortgage' by MONTHS_IN_YEAR to get the annual mortgage payment.
        double annualMortgage = monthlyMortgage * MONTHS_IN_YEAR;

        //Formats 'monthlyMortgage' as a currency and storing it as a string in the variable 'mortgageFormatted'
        String monthlyMortgageFormatted = NumberFormat.getCurrencyInstance().format(monthlyMortgage);
        String annualMortgageFormatted = NumberFormat.getCurrencyInstance().format(annualMortgage);
        System.out.println("Monthly mortgage payment: " + monthlyMortgageFormatted);
        System.out.println("Annual mortgage payment: " + annualMortgageFormatted);
    }
}

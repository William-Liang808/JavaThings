package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

class account {
    int money_in_account;
}
class welcome {
    public void intro(String text) {
        System.out.println("Hello " + text + ", welcome to mobile banking!" );
    }
}

class options {
    public void displayOptions() {
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Check Previous Transactions");
        System.out.println("5. Exit");
    }

}
public class SimpleBanking {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        welcome user = new welcome();
        options options = new options();
        account balance = new account();
        balance.money_in_account = 1_200;

        //Stage 1: Welcome -- complete
        System.out.println("Enter Username: ");
        user.intro(scanner.nextLine());

        //Displays options
        System.out.println("Enter a number (1-5)");


        //Lets user select which option he/she wants
        //validates whether input is valid or invalid from (1-5)
        int optionInput;
        int deposit;
        int withdraw;
        options.displayOptions();
        do {

            optionInput = scanner.nextInt();

            switch (optionInput) {
                case 1:
                    System.out.println("Current Balance:");
                    System.out.println(NumberFormat.getCurrencyInstance().format(balance.money_in_account));
                    break;
                case 2:
                    System.out.println("How much would you like to deposit?");
                    deposit = scanner.nextInt() + balance.money_in_account;
                    System.out.println("New Balance: " + NumberFormat.getCurrencyInstance().format(deposit));
                    break;
                case 3:
                    System.out.println("How much would you like to withdraw");
                    withdraw = balance.money_in_account - scanner.nextInt();
                    System.out.println("New Balance: " + NumberFormat.getCurrencyInstance().format(withdraw));
                    break;
                case 4:
                    System.out.println("Check your previous transactions");
                    System.out.println("244hz Gaming Monitor - $350");
                    System.out.println("McDonald's - $25");
                    System.out.println("Waifu pillow - $100");
                    break;
                case 5:
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Invalid option, please try again.");
            }
        }
        while (optionInput < 1 ||  optionInput > 5);
        System.out.println("Thank you for using our services");
    }
}

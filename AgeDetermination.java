package com.company;

import java.util.Scanner;

public class AgeDetermination {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age1 = scanner.nextInt();
        System.out.println("Enter age: ");
        int age2 = scanner.nextInt();
        System.out.println("Enter age: ");
        int age3 = scanner.nextInt();

        if (age1 < age2 && age1 < age3) {
            System.out.println("youngest: " + age1);
            if (age2 > age3) {
                System.out.println("oldest: " + age2);
            }
            else if (age2 < age3) {
                System.out.println("oldest" + age3);
            }
        }
        else if (age2 < age1 && age2 < age3) {
            System.out.println("youngest: " + age2);
            if (age1 > age3) {
                System.out.println("oldest: " + age1);
            }
            else if (age1 < age3) {
                System.out.println("oldest: " + age3);
            }
        }
        else if (age3 < age1 && age3 < age2) {
            System.out.println("youngest: " + age3);
            if (age1 > age2) {
                System.out.println("oldest: " + age1);
            }
            else if (age1 < age2) {
                System.out.println("oldest: " + age2);
            }
        }
    }
}

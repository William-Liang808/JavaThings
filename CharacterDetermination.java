/*Determines whether the character the user
inputs is uppercase or lowercase by using ASCII
values corresponding with the letters 'a-z' & 'A-Z'
*/
package com.company;

import java.util.Scanner;

public class CharacterDetermination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char letter = scanner.next().charAt(0);

        if (letter >= 97 && letter <= 122) {
            System.out.println("lower case");
        }
        else if (letter >= 65 && letter <= 90) {
            System.out.println("uppercase");
        }


    }

}
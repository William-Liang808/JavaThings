import java.util.Scanner;
import java.lang.Math;

public class Gamble {
    public static void main(String[] args){
        int random = (int)(Math.random()*2) + 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount of money to bet: ");
        int moneyBet = scanner.nextInt();

        //player 1 number input
        System.out.println("Player 1, Enter a number: ");
        int player1 = scanner.nextInt();

        //player 2 number input
        System.out.println("Player 2, Enter a number: ");
        int player2 = scanner.nextInt();

        //select player with larger integer
        if (random == 1) {
            System.out.println("Selecting Larger Number...");
            int bigInt = Math.max(player1, player2);
            System.out.println("Winner: " + bigInt);
        }
        //select player with smaller integer
        else {
            System.out.println("Selecting Smaller Number...");
            int smallInt = Math.min(player1, player2);
            System.out.println("Winner: " + smallInt);


        }
        System.out.println("Prize Money: $" + moneyBet);
    }
}

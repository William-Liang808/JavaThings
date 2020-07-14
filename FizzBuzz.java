import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        //User input for dividing number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer");
        int number = scanner.nextInt();

        if (number % 3 == 0 && number % 5 == 0)
            System.out.println("FizzBuzz");
        else if (number % 3 == 0)
            System.out.println("Buzz");
        else if (number % 5 == 0)
            System.out.println("Fizz");
        else
            System.out.println(number);
    }
}

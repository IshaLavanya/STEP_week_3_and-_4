package Level1;

import java.util.Scanner;

public class SmallestNumberCheck {
    public static void main(String[] args) {

        // Declare variables
        try (Scanner input = new Scanner(System.in)) {
            int number1, number2, number3;
            // Input values
            System.out.print("Enter first number: ");
            number1 = input.nextInt();
            System.out.print("Enter second number: ");
            number2 = input.nextInt();
            System.out.print("Enter third number: ");
            number3 = input.nextInt();
            // Check condition
            if (number1 < number2 && number1 < number3) {
                System.out.println("Is the first number the smallest? Yes");
            } else {
                System.out.println("Is the first number the smallest? No");
            }
        }
    }
}
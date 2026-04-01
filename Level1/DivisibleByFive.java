package Level1;

import java.util.Scanner;

public class DivisibleByFive {
    public static void main(String[] args) {

        // Declare variable
        try ( // Create scanner object for input
                Scanner input = new Scanner(System.in)) {
            // Declare variable
            int number;
            
            // Take user input
            System.out.print("Enter a number: ");
            number = input.nextInt();
            
            // Check divisibility
            if (number % 5 == 0) {
                System.out.println("Is the number " + number + " divisible by 5? Yes");
            } else {
                System.out.println("Is the number " + number + " divisible by 5? No");
            }
        }
    }
}
package Level2;

import java.util.Scanner;

public class FizzBuzzForLoop {
    public static void main(String[] args) {

        // Variable
        try (Scanner input = new Scanner(System.in)) {
            // Variable
            int number;
            
            // Input
            System.out.print("Enter a number: ");
            number = input.nextInt();
            
            // Check for positive integer
            if (number > 0) {
                
                for (int i = 1; i <= number; i++) {
                    
                    if (i % 3 == 0 && i % 5 == 0) {
                        System.out.println("FizzBuzz");
                    } else if (i % 3 == 0) {
                        System.out.println("Fizz");
                    } else if (i % 5 == 0) {
                        System.out.println("Buzz");
                    } else {
                        System.out.println(i);
                    }
                }
                
            } else {
                System.out.println("Please enter a positive number.");
            }
        }
    }
}
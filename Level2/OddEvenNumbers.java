package Level2;

import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {

        // Variable declaration
        try (Scanner input = new Scanner(System.in)) {
            // Variable declaration
            int number;
            
            // Input
            System.out.print("Enter a number: ");
            number = input.nextInt();
            
            // Check for natural number
            if (number >= 1) {
                
                // Loop from 1 to number
                for (int i = 1; i <= number; i++) {
                    
                    // Check even or odd
                    if (i % 2 == 0) {
                        System.out.println(i + " is Even");
                    } else {
                        System.out.println(i + " is Odd");
                    }
                }
                
            } else {
                System.out.println("Invalid input. Please enter a natural number.");
            }
        }
    }
}
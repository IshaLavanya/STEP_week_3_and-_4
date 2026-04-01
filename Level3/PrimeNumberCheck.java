package Level3;

import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {

        // Variable declaration
        try (Scanner input = new Scanner(System.in)) {
            // Variable declaration
            int number;
            boolean isPrime = true;
            
            // Input
            System.out.print("Enter a number: ");
            number = input.nextInt();
            
            // Check condition
            if (number <= 1) {
                isPrime = false;
            } else {
                
                // Loop to check factors
                for (int i = 2; i <= number / 2; i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break; // exit loop early
                    }
                }
            }
            
            // Output
            if (isPrime) {
                System.out.println(number + " is a Prime Number");
            } else {
                System.out.println(number + " is not a Prime Number");
            }
        }
    }
}
package Level1;

import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {

        // Variable declaration
        try (Scanner input = new Scanner(System.in)) {
            // Variable declaration
            int age;
            
            // Input
            System.out.print("Enter age: ");
            age = input.nextInt();
            
            // Condition check
            if (age >= 18) {
                System.out.println("The person's age is " + age + " and can vote.");
            } else {
                System.out.println("The person's age is " + age + " and cannot vote.");
            }
        }
    }
}
package Level2;

import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {

        // Variables
        try (Scanner input = new Scanner(System.in)) {
            // Variables
            double salary;
            int yearsOfService;
            double bonus = 0;
            
            // Input
            System.out.print("Enter salary: ");
            salary = input.nextDouble();
            
            System.out.print("Enter years of service: ");
            yearsOfService = input.nextInt();
            
            // Condition for bonus
            if (yearsOfService > 5) {
                bonus = salary * 0.05;
            }
            
            // Output
            System.out.println("Bonus amount is: " + bonus);
        }
    }
}
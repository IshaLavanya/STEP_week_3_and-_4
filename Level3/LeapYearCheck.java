package Level3;

import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {

        // Variable
        try (Scanner input = new Scanner(System.in)) {
            // Variable
            int year;
            
            // Input
            System.out.print("Enter year: ");
            year = input.nextInt();
            
            // Check for Gregorian calendar
            if (year >= 1582) {
                
                // Leap year logic
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    System.out.println("Year is a Leap Year");
                } else {
                    System.out.println("Year is not a Leap Year");
                }
                
            } else {
                System.out.println("Year should be >= 1582");
            }
        }
    }
}
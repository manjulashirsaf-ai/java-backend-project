package com.example;

import java.util.Scanner;

public class TryCatchConcepts {

    // Method that may throw ArithmeticException
    public static int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter numerator: ");
            int num = sc.nextInt(); // May throw InputMismatchException

            System.out.print("Enter denominator: ");
            int den = sc.nextInt(); // May throw InputMismatchException

            int result = divide(num, den); // May throw ArithmeticException
            System.out.println("Result: " + result);
        }
        // Catch if user enters something that's not an integer
        catch (java.util.InputMismatchException e) {
            System.out.println("Error: Please enter valid integers!");
        }
        // Catch division by zero
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        }
        // Optional: catch any other exceptions
        catch (Exception e) {
            System.out.println("Some unexpected error occurred: " + e.getMessage());
        }
        finally {
            // Runs always
            System.out.println("Execution of try-catch block completed.");
            sc.close(); // Always close resources
        }
    }
}

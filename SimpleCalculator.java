import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Input two numbers from the user
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Input the operation
        System.out.print("Enter the operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        // Declare a variable to store the result
        double result;

        // Perform the operation based on user input
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                // Check for division by zero
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error! Division by zero.");
                    return; // Exit the program if division by zero occurs
                }
                break;
            default:
                System.out.println("Invalid operator!");
                return; // Exit the program if the operator is invalid
        }

        // Output the result
        System.out.println("The result is: " + result);

        // Close the scanner
        scanner.close();
    }
}

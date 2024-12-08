import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        // Create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Input the year to be checked
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Check if the year is a leap year or not
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        // Close the scanner
        scanner.close();
    }
}

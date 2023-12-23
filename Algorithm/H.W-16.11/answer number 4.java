import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creating a Scanner object for user input
        System.out.println("Hi, please write a negative number:");  // Prompting the user to write a negative number
        int negativeNumber = scanner.nextInt();     // Input: Getting the negative number from the user
        int absoluteValue = Math.abs(negativeNumber);   // Processing: Calculating the absolute value of the negative number
        System.out.println("This is the absolute value:"); // Output: Displaying the absolute value
        System.out.println(absoluteValue);
        scanner.close(); // Closing the Scanner to prevent resource leaks

    }
}

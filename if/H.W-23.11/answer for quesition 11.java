import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of dishes the customer ordered:");
        int quantity = scanner.nextInt();

        System.out.println("Enter the price per dish:");
        double pricePerDish = scanner.nextDouble();

        double totalAmount;

        if (quantity > 50) {
            // Calculation for a customer who ordered more than 50 dishes
            totalAmount = quantity * (pricePerDish - 2);
        } else {
            // Calculation for a customer who ordered 50 or fewer dishes
            totalAmount = quantity * pricePerDish;
        }

        System.out.println("The total amount the customer has to pay is: $" + totalAmount);

        scanner.close();
    }
}

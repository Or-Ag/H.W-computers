import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("enter number (N): ");
        int N = scanner.nextInt();

        scanner.close();

        System.out.printf("%-10s%-10s%-20s%-20s%n", "number", "square", "square root", "Reciprocal");

        for (int number = 1; number <= N; number++) {

            System.out.printf("%-10d%-10d%-20f%-20f%n", number, number * number, Math.sqrt(number), 1.0 / number);
        }
    }
}

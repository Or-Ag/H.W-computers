import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[30];
        Random rnd = new Random();

        int sumOnes = 0;
        int sumTens = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rnd.nextInt(90) + 10;

            int onesDigit = numbers[i] % 10;
            int tensDigit = numbers[i] / 10;

            sumOnes += onesDigit;
            sumTens += tensDigit;
        }

        System.out.println("Generated numbers:");

        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("\n\nSum of ones digits: " + sumOnes);
        System.out.println("Sum of tens digits: " + sumTens);
    }
}

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int sumOfOnes = 0;
        int sumOfTens = 0;

        for (int i = 0; i < 30; i++) {
            int randomNumber = random.nextInt(90) + 10;
            System.out.print(randomNumber + " ");

            int onesDigit = randomNumber % 10;
            int tensDigit = randomNumber / 10 % 10;

            sumOfOnes += onesDigit;
            sumOfTens += tensDigit;
        }

        System.out.println("\nSum of ones digits: " + sumOfOnes);
        System.out.println("Sum of tens digits: " + sumOfTens);
    }
}

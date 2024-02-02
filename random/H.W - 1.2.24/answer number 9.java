import java.util.Random;

public class SimpleMaxRandomNumberExample {
    public static void main(String[] args) {
        Random rnd = new Random();
        int maxNumber = 0;  // Assume the minimum possible value is 0

        for (int i = 0; i < 10; i++) {
            int randomNumber = rnd.nextInt(10) + 1; // Generate a random number between 1 and 10

            System.out.println("Generated number: " + randomNumber);

            maxNumber = Math.max(maxNumber, randomNumber);
        }

        System.out.println("\nThe maximum number is: " + maxNumber);
    }
}

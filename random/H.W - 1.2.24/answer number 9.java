import java.util.Random;

public class MaxRandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int maxNumber = 0;

        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(10) + 1; // בחירת מספר אקראי בין 1 ל-10

            System.out.println("Random Number " + (i + 1) + ": " + randomNumber);

            if (randomNumber > maxNumber) {
                maxNumber = randomNumber;
            }
        }

        System.out.println("\nThe largest random number is: " + maxNumber);
    }
}

import java.util.Random;

public class NegativeDigitPairs {
    public static void main(String[] args) {
        Random random = new Random();
        int countIdenticalPairs = 0;

        do {
            int digit1 = random.nextInt(10) * -1;
            int digit2 = random.nextInt(10) * -1;

            System.out.println("(" + digit1 + ", " + digit2 + ")");

            if (digit1 == digit2) {
                countIdenticalPairs++;
            }

        } while (digit1 != 0 && digit2 != 0);

        System.out.println("\nNumber of identical pairs: " + countIdenticalPairs);
    }
}

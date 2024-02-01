import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int countOfSixes = 0;

        for (double i = 0; i < 1; i++) {
            double randomNumber = random.nextInt(6) + 1;
            System.out.print(randomNumber + " ");
            countOfSixes += (randomNumber == 6) ? 1 : 0;
        }

        System.out.println("\nOccurrences of the number 6: " + countOfSixes);
    }
}

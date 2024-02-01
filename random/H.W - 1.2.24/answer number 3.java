import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        int countOfTens = 0;
        int countOfFifties = 0;

        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(41) + 10;
            System.out.print(randomNumber + " ");
            countOfTens += (randomNumber == 10) ? 1 : 0;
            countOfFifties += (randomNumber == 50) ? 1 : 0;
        }

        System.out.println("\nOccurrences of the number 10: " + countOfTens);
        System.out.println("Occurrences of the number 50: " + countOfFifties);
    }
}

import java.util.Random;

public class CountSixes {
    public static void main(String[] args) {
        Random random = new Random();
        int countOfSixes = 0;

        for (int i = 0; i < 50; i++) {
            int randomNumber = random.nextInt(6) + 1;
            System.out.print(randomNumber + " ");
            countOfSixes += (randomNumber == 6) ? 1 : 0;
        }

        System.out.println("\nOccurrences of the number 6: " + countOfSixes);
    }
}

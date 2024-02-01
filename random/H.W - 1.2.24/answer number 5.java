import java.util.Random;

public class RandomNumbersStopAtZero {
    public static void main(String[] args) {
        Random random = new Random();
        int generatedNumber;
        int count = 0;

        do {
            generatedNumber = random.nextInt(7) * 3;
            System.out.print(generatedNumber + " ");
            count++;
        } while (generatedNumber != 0);

        System.out.println("\nNumber of generated numbers: " + count);
    }
}

import java.util.Random;

public class AscendingNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        int countAscendingNumbers = 0;

        for (int i = 0; i < 30; i++) {
            int number = random.nextInt(450) * 2 + 101;
            System.out.print(number + " ");

            if ((number / 100 < number / 10 % 10) && (number / 10 % 10 < number % 10)) {
                countAscendingNumbers++;
            }
        }

        System.out.println("\nNumber of ascending numbers: " + countAscendingNumbers);
    }
}

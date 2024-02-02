import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int count10 = 0;
        int count50 = 0;

        Random rnd = new Random();

        for (int i = 0; i < numbers.length; i++) {
            int index = rnd.nextInt(5);
            numbers[i] = (index + 1) * 10;
            System.out.println(numbers[i]);
            if (numbers[i] == 10) {
                count10++;
            } else if (numbers[i] == 50) {
                count50++;
            }
        }

        System.out.println("Occurrences of 10: " + count10 + " times");
        System.out.println("Occurrences of 50: " + count50 + " times");
    }
}

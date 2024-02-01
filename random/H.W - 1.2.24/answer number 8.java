import java.util.Random;

public class RepeatName {
    public static void main(String[] args) {
        Random random = new Random();
        int randomCount = random.nextInt(5) + 1; // בחירת מספר אקראי בין 1 ל-5
        String name = "mis"; // השם להצגה

        for (int i = 0; i < randomCount; i++) {
            System.out.println(name);
        }
    }
}

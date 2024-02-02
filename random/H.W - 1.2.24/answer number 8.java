import java.util.Random;

public class Main   {
    public static void main(String[] args) {
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(5) + 1; // Generate a random number between 1 and 5

        String mis = "mis";  // Assuming your first name is "mis"

        for (int i = 0; i < randomNumber; i++) {
            System.out.println(mis);
        }
    }
}

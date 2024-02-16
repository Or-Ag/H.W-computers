import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int timeInSeconds;

        System.out.println("Enter running times in seconds (0 to end):");

        while (true) {
            timeInSeconds = scanner.nextInt();
            if (timeInSeconds == 0) {
                break;
            }

            int hours = timeInSeconds / 3600;
            int remainingSeconds = timeInSeconds % 3600;
            int minutes = remainingSeconds / 60;
            int seconds = remainingSeconds % 60;

            System.out.println(timeInSeconds + " seconds = " + hours + " hours, " + minutes + " minutes, and " + seconds + " seconds.");
        }

    }
}





answers
105 seconds = 0 hours, 1 minutes, and 45 seconds.
807 seconds = 0 hours, 13 minutes, and 27 seconds.
432 seconds = 0 hours, 7 minutes, and 12 seconds.
4000 seconds = 1 hours, 6 minutes, and 40 seconds.
5432 seconds = 1 hours, 30 minutes, and 32 seconds.
12345 seconds = 3 hours, 25 minutes, and 45 seconds.
55 seconds = 0 hours, 0 minutes, and 55 seconds.
60 seconds = 0 hours, 1 minutes, and 0 seconds.
3600 seconds = 1 hours, 0 minutes, and 0 seconds.

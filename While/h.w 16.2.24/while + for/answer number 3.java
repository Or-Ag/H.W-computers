import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int i = 0;

        System.out.println("Enter 40 grades:");

        while (i < 40) {
            int grade = scanner.nextInt();
            if (grade >= 80 && grade <= 100) {
                count++;
            }
            i++;
        }

        System.out.println("Number of grades between 80 and 100: " + count);
        
        scanner.close();
    }
}

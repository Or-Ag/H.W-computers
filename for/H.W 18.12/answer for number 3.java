import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("This is a system that prints all the nails that are divisible by seven from 1 - a number you choose");
        int n = scanner.nextInt();
        for(int number=1; number<=n; number++)
        {
            if (number % 7 == 0)
                System.out.println(number);
        }
    }
}

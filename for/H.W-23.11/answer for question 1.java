import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi, please provide me a negative or positive number");
        int number = scanner.nextInt();
        if (number > 0)
        {
            System.out.println("true, your number is positive");
        }
        else
        {
            System.out.println("false, your number is negative");
        }
    }
}

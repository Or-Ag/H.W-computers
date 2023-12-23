import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi, please provide me a negative or positive number");
        int gymprice = scanner.nextInt();
        if (gymprice < 150)
        {
            System.out.println("excellent price");
        }
        if (gymprice > 150 && gymprice < 250)
        {
            System.out.println("the price so so");
        }
        if (gymprice>250)
        {
            System.out.println("the price is expensive but worth the price ");
        }
        System.out.println("Thanks for use this system!");
    }
}

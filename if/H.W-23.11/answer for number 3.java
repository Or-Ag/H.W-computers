import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi, please enter the number of kids that came to the activity ");
        int student = scanner.nextInt();
        if (student > 40)
        {
            System.out.println("Youre an excellent leader ");
        }
        if (student > 20 && student < 30)
        {
            System.out.println("this is the highest kids in the brunch");
        }
        if (student > 10 && student < 20)
        {
            System.out.println("it is a ok number of kids");
        }
        if (student < 10)
        {
            System.out.println("you need need more kids ");
        }
        System.out.println("A youth movement to realize the vision of creating a society that learns and does");
    }
}

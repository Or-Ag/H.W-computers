import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi, Please enter the garage name");
        String garage = scanner.next();
        System.out.println("Please write how many wheels do you have");
        int car_wheels = scanner.nextInt();

        if (car_wheels == 4)
        {
            System.out.println("Heavy");
            System.out.println(garage);
        }
        else if (car_wheels == 2)  // Use "else if" to make the conditions exclusive
        {
            System.out.println(garage);
            System.out.println("Two");
        }
        else if (car_wheels == 1)
        {
            System.out.println("Error");
            System.out.println(garage);
        }
        else
        {
            System.out.println("Invalid number of wheels");
        }

        System.out.println("Have a good day");

        // Close the scanner
        scanner.close();
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi, Please enter the student name");
        String student_name = scanner.next();
        System.out.println("Please write the student subtraction");
        int activities_count = scanner.nextInt();
        if (activities_count>5)
        {
            System.out.println("You're receive a gift");
            System.out.println("But you ned to pay" + activities_count*100);
        }
        if (activities_count<5);
        {
            System.out.println("The price that you need to pay is" + activities_count*100);
        }

    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi, Please enter the student name");
        String student_name = scanner.next();
        System.out.println("Please write the student subtraction");
        int student_substraction = scanner.nextInt();
        if (student_substraction>5)
        {
            System.out.println("warning");
        }
        if (student_substraction==0)
        {
            System.out.println("excellent");
        }

    }
}

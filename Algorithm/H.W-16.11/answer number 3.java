import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please write a number with 1 digit");
        int onenumber = scanner.nextInt();
        System.out.println("please write a number with 2 digit");
        int twonumbers = scanner.nextInt();
        scanner.close();
        int units = twonumbers %10;
        int asarot = twonumbers /10;
        int allnumbers = asarot * 100 + onenumber * 10 + units;
        System.out.println(allnumbers);
    }
}

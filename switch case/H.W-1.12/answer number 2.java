import java.util.Scanner;

public class Main {
    public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the corrects wins number");
    int grade = scanner.nextInt();
    switch (grade) {
        case 16:
            System.out.println("you won 6,000,000 nis");
            break;
        case 15:
            System.out.println("You won 200,000 nis");
            break;
        case 14:
            System.out.println("You won 2,500 nis");
            break;
        case 13:
            System.out.println("You won 18 nis");
        break;
        default:
            System.out.println("Invalid number");
    }

    }
}

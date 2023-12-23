import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("A program that receives 2 numbers N and M and prints the sum of all numbers between the first number and the second input number");
        System.out.println("choose the first number:");
        int M = scanner.nextInt();
        System.out.println("Choose the second number");
        int N = scanner.nextInt();
        for(int i=1; N<=M; i++)
        {
            System.out.println(N+M);
            break;
        }
    }
}

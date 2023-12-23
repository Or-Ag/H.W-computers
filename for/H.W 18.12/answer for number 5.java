import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("This is a program that prints the product of all numbers between 1 and 50.");
        for(int i=1; i<=50; i++)
        {
            if (i % 5 == 0)
                System.out.println(i);
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("This is a program that prints all numbers from 100 to 200 (inclusive) that are divisible by 9 with a remainder of 1.");
        for(int i=100; i<=201; i++)
        {
            if (i % 9 == 1)
                System.out.println(i);
        }
    }
}

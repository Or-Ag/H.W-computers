import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("This is a system that print all the numbers from 1-100");
        for(int i=0; i<101; i++ )
        {
            System.out.println(i);
            System.out.println(",");
        }
    }
}

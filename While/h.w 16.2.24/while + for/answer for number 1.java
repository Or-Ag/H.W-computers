import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        int i, n, X = 0;
        System.out.println("choose number ");
        n = io.nextInt();
        for (i = 1; i <= n; i++) {
            X += 2 * i;
        }
        System.out.println("The sum is: " + X);
        io.close();
    }
}


1.ב
בחר/י מספר שלם:
4
The sum is: 20


  1.ג
import java.util.Scanner;

public class TurCheshboney {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        int i = 1, n, X = 0;
        System.out.println("Choose a number ");
        n = io.nextInt();
        while (i <= n) {
            X += 2 * i;
            i++;
        }
        System.out.println("The sum is: " + X);
        io.close();
    }
}

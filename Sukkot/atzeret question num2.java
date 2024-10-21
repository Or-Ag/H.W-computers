import java.util.Scanner;

public class Main {
    public static long[] factorialArray(int n) {
        long[] factorials = new long[n + 1];

        factorials[0] = 1;
        for (int i = 1; i <= n; i++) {
            factorials[i] = factorials[i - 1] * i;
        }

        return factorials;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("give number for the maximum factorial");
        int f = scanner.nextInt();
        int n = f;
        long[] result = factorialArray(n);

          for (long value : result) {
            System.out.print(value + " ");
        }
    }
}

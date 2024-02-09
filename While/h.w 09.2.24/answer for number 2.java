public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            System.out.print("1");
            if (i != 100) {
                System.out.print(" + ");
            }
            sum += i;
        }
        System.out.println("\nSum: " + sum);
    }
}


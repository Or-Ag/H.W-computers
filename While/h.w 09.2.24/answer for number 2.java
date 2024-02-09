public class Main {
    public static void main(String[] args) {
        double sum = 0.0;

        System.out.print("Series: ");
        for (int i = 1; i <= 100; i++) {
            sum += 1.0 / i;
            System.out.print("1/" + i);
            if (i != 100) {
                System.out.print(" + ");
            }
        }

        System.out.println("\nSum: " + sum);
    }
}

public class Main {
    public static void main(String[] args) {
        double sum = 0.0;
        int n = 1;

        System.out.print("Series: ");
        while (sum <= 3) {
            sum += 1.0 / n;
            System.out.print("1/" + n);
            if (sum <= 3) {
                System.out.print(" + ");
            }
            n++;
        }

        System.out.println("\nSum: " + sum);
    }
}

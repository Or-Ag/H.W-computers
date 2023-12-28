public class SeriesSum {
    public static void main(String[] args) {
        int n = 99; // The last number in the sequence
        int sum = 0;

        System.out.print("Sequence: ");
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + " ");

            // Adding each number in the sequence to the sum
            sum += i;
        }

        System.out.println("\nSum of the sequence: " + sum);
    }
}

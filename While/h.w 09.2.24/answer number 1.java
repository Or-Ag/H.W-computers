import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hey! This is the Candidate Selection System.");

        int tallestCandidate = 0, shortestCandidate = 0;
        int tallestHeight = Integer.MIN_VALUE, shortestHeight = Integer.MAX_VALUE;

        System.out.println("Enter candidate details (or enter -1 to finish):");

        while (true) {
            System.out.print("Candidate number: ");
            int candidateNumber = scanner.nextInt();
            if (candidateNumber == -1) {
                break;
            }

            System.out.print("Candidate height: ");
            int candidateHeight = scanner.nextInt();

            if (candidateHeight > tallestHeight) {
                tallestHeight = candidateHeight;
                tallestCandidate = candidateNumber;
            }
            if (candidateHeight < shortestHeight) {
                shortestHeight = candidateHeight;
                shortestCandidate = candidateNumber;
            }
        }

        System.out.println("Tallest candidate: " + tallestCandidate + ", Height: " + tallestHeight);
        System.out.println("Shortest candidate: " + shortestCandidate + ", Height: " + shortestHeight);
    }
}

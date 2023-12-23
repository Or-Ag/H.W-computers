import java.util.Scanner;

public class CompetitionScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Scores for Class 10
        System.out.println("Enter the score for Class 10:");
        int scoreClass10 = scanner.nextInt();

        // Input: Scores for Class 11
        System.out.println("Enter the score for Class 11:");
        int scoreClass11 = scanner.nextInt();

        // Determine the winner and calculate the point difference
        int pointDifference;
        String winner;

        if (scoreClass10 > scoreClass11) {
            winner = "Class 10";
            pointDifference = scoreClass10 - scoreClass11;
        } else {
            winner = "Class 11";
            pointDifference = scoreClass11 - scoreClass10;
        }

        // Output: Winner and point difference
        System.out.println("The winning class is: " + winner);
        System.out.println("Point difference: " + pointDifference);

        // Close the scanner
        scanner.close();
    }
}

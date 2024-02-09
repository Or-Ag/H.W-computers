import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int compHigher = 0, mathHigher = 0;
        double compAvg = 0, mathAvg = 0, totalAvg = 0;
        int count = 0;

        while (true) {
            System.out.print("Enter Computer Science and Mathematics grades (or enter -1 -1 to finish): ");
            int compGrade = scanner.nextInt();
            int mathGrade = scanner.nextInt();

            if (compGrade == -1 || mathGrade == -1) {
                break;
            }

            count++;
            compAvg += compGrade;
            mathAvg += mathGrade;

            if (compGrade > mathGrade) {
                compHigher++;
            } else if (mathGrade > compGrade) {
                mathHigher++;
            }
        }

        if (count > 0) {
            compAvg /= count;
            mathAvg /= count;
            totalAvg = (compAvg + mathAvg) / 2;
        }

        System.out.println("Students with higher grade in Computer Science: " + compHigher);
        System.out.println("Students with higher grade in Mathematics: " + mathHigher);
        System.out.println("Average grade in Computer Science: " + compAvg);
        System.out.println("Average grade in Mathematics: " + mathAvg);
        System.out.println("Overall average grade: " + totalAvg);
    }
}

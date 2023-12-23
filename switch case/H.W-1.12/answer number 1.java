import java.util.Scanner;

public class GradeConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the student's grade as an integer
        System.out.print("Enter the student's grade as an integer: ");
        int grade = scanner.nextInt();

        // Convert the grade to words using the convertToWords function
        String gradeInWords = convertToWords(grade);

        // Print the grade in words
        System.out.println("The grade in words is: " + gradeInWords);
    }

    // Function to convert the numeric grade to words
    private static String convertToWords(int grade) {
        switch (grade) {
            case 10:
                return "Excellent";
            case 9:
                return "Almost Excellent";
            case 8:
                return "Good";
            case 7:
                return "Almost Good";
            case 6:
                return "Sufficient";
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                return "Not Sufficient";
            default:
                return "Invalid Grade";
        }
    }
}

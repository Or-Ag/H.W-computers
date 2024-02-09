import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int childrenCount = 0, adultsCount = 0, pensionersCount = 0, unpaidChildrenCount = 0;
        double totalRevenue = 0.0;

        while (true) {
            System.out.print("Enter passenger's age (or enter 999 to finish): ");
            int age = scanner.nextInt();

            if (age == 999) {
                break;
            }

            if (age <= 6) {
                childrenCount++;
                unpaidChildrenCount++;
            } else if (age <= 18) {
                childrenCount++;
                totalRevenue += 4.6;
            } else if (age <= 60) {
                adultsCount++;
                totalRevenue += 10.5;
            } else {
                pensionersCount++;
                totalRevenue += 7.4;
            }
        }

        int totalPassengers = childrenCount + adultsCount + pensionersCount;
        double totalEarnings = totalRevenue - (unpaidChildrenCount * 4.6);

        System.out.println("Children passed: " + childrenCount);
        System.out.println("Adults passed: " + adultsCount);
        System.out.println("Pensioners passed: " + pensionersCount);
        System.out.println("Unpaid children: " + unpaidChildrenCount);
        System.out.println("Total passengers: " + totalPassengers);
        System.out.println("Total earnings: " + totalEarnings + " NIS");
    }
}

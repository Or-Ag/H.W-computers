import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        System.out.println("This is a program that prints the following series and the sum of the series: 1/1 , 1/2 , 1/3 , 1/4 , .. , 1/N");
        int n = scanner.nextInt();
        for(int i=3; i<=66; i+=3)
        {
            double f = 1.0 / i;
            System.out.println(f + " ");
            sum+=f;

        }
        System.out.println("the total of the number is" + " "+ sum);
    }
}

//question B

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        System.out.println("This is a program that prints the following series and the sum of the series: 1/1 , 1/2 , 1/3 , 1/4 , .. , 1/N");
        for(int i=99; i>=1; i--)
        {
            double f = 1.0 / (3 * i);
            System.out.println(f + " ");
            sum+=f;

        }
        System.out.println("the total of the number is" + " "+ sum);
    }
}

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void mult(int num)
    {
        int ones,tens,sum;
        ones = num%10;
        tens = num/10;
        sum = (ones*tens);
        System.out.println("the sum is" + sum);

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.println("enter positive number");
        num = scan.nextInt();

        while (num > 0) {
            mult(num);

            num = scan.nextInt();
        }

    }
}


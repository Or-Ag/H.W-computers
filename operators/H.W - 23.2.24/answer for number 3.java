import java.util.Scanner;

public class Main {

    public static void mult(int num)
    {
        int ones, tens;
        ones = num %10;
        tens = num/10;
        System.out.println(ones+tens);
    }
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        int num;
        do{
            System.out.println("enter number");
            num = io.nextInt();
            mult(num);

        }while(num>0);


    }
}

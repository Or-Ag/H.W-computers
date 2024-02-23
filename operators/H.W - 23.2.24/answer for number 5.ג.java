import java.util.Scanner;

public class Main {

    public static void prime(int num)
    {
        int count=0;
        for(int y=0;y<=num;y++) {
            count=0;
            for (int i = 2; i < y; i++) {
                if (y % i == 0) {
                    count++;
                }

            }
            if (count == 0) System.out.println(y);
        }
    }
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        int num;
        do{
            System.out.println("enter number");
            num = io.nextInt();
            if (num%2==0) {
                prime(num);
            }

        }while(num!=0);


    }
}


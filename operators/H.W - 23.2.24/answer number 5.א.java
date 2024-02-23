import java.util.Scanner;

public class Main {

    public static void prime(int num)
    {
        int count=0;
        for(int i =2;i<num;i++)
        {
            if (num%i==0)
            {
                count++;
            }

        }
        if(count!=0) System.out.println("not prime");
        if(count==0) System.out.println("prime");
    }
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        int num;
        do{
            System.out.println("enter number");
            num = io.nextInt();
            prime(num);

        }while(num>0);


    }
}

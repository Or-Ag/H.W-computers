//question number 3//


import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args)
    {
    int num, yechidot, asarot, meot;
    int sum;
    System.out.println("Hi, Please write 3 digits number");
    Scanner input = new Scanner(System.in);
    num = input.nextInt();
    yechidot=num%10;
    asarot=num/10%10;
    meot = num/100;
    sum= yechidot+asarot+meot;
    System.out.println("This is a connecting all over the digits");
    System.out.println(sum);
    }
}

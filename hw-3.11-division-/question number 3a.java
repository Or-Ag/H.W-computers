//question number 2//

import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args)
    {
    int num, yechidot, asarot;
    int sum;
    System.out.println("Hi, Please write 2 digits number");
    Scanner input = new Scanner(System.in);
    num = input.nextInt();
    yechidot=num%10;
    asarot=num/10%10;
    sum= yechidot+asarot;
    System.out.println(sum);
    }
}

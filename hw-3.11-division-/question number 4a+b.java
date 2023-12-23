//question number 4.a//

import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args)
    {
    int num, yechidot, asarot, meot;
    int sum;
    System.out.println("Hi, This system take two-digit number inverts it and adds 1 to the result");
    Scanner input = new Scanner(System.in);
    num = input.nextInt();
    yechidot=num%10;
    asarot=num/10%10;
    sum= yechidot+asarot;
    System.out.println("This is a connecting all over the digits and add 1 to the result");
    System.out.println(yechidot*10 + asarot +1);
    }
}


//question number 4.b//


import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args)
    {
            {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter a three-digit number: ");
                int num = scanner.nextInt();

                int reversedNum = ((num % 10) * 100) + (((num / 10) % 10) * 10) + (num / 100);
                int result = reversedNum + 1;

                System.out.println("The reversed number is: " + reversedNum);
                System.out.println("The result after adding 1 is: " + result);
            }
        }

    }

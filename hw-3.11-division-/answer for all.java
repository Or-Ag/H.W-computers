//question number 1//

import java.sql.SQLOutput;
import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner books = new Scanner(System.in);
        System.out.println(("Hello! how much books do you have?"));
        int count_books = books.nextInt();
        System.out.println("Let me check...");
        int books_ = count_books/15;
        System.out.println("They need to be in - shelfs");
        System.out.println(books_);
        System.out.println("You will have this number of books, that they don't have a shelf");
        int books_1 = count_books%15;
        System.out.println(books_1);

    }
}

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

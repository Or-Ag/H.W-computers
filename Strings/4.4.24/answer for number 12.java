import java.util.*;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("How much time do you want the program to run?");
        int num = input.nextInt();
        int count = 0;
        String str = input.nextLine();
        for (int i = 0; i<num; i++)
        {
            System.out.println("Pls write a sentence");
            str = input.nextLine();
            if (str.indexOf("a")>=0)
            {
                count++;
            }
            if (str.indexOf("e")>=0)
            {
                count++;
            }
            if (str.indexOf("i")>=0)
            {
                count++;
            }
            if (str.indexOf("o")>=0)
            {
                count++;
            }
            if (str.indexOf("u")>=0)
            {
                count++;
            }
            System.out.println(count);

        }


    }
}

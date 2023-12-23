package com.company;  // Correct package declaration

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How much interchange you've passed? ");
        int interchange = scanner.nextInt();

        // Regular price per ticket
        int regularinterchange = 30;

        // Discounted price per ticket for orders over 100
        int discountinterchange = 10;
        int finalcharge= interchange*regularinterchange-discountinterchange;
        int finalcharge_1 = interchange*regularinterchange;
        // Check if more than 100 tickets were ordered
        if ( interchange > 8 )
        {
            System.out.println("you need to pay after the discount" );
            System.out.println(finalcharge);
        }
        else
        {
            System.out.println("you need to pay");
            System.out.println(finalcharge_1);

        }



        // Close the scanner
        scanner.close();
    }
}

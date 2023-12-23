package com.company;  // Correct package declaration

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of tickets ordered: ");
        int numTickets = scanner.nextInt();

        // Regular price per ticket
        int regularPrice = 48;

        // Discounted price per ticket for orders over 100
        int discountPrice = 43;

        // Check if more than 100 tickets were ordered
        if (numTickets > 100) {
            numTickets *= discountPrice;
        } else {
            numTickets *= regularPrice;
        }

        // Print the total cost to be paid
        System.out.println("The total amount due is: " + numTickets + " dollars");

        // Close the scanner
        scanner.close();
    }
}

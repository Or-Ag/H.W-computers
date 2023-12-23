import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double legth;
        System.out.println("Hi. this is  system that calculate the area and the perimeter in square");
        System.out.println("Please write the length of the rectangle");
        Scanner scanner = new Scanner(System.in);
        double length = scanner.nextDouble();

        System.out.println("Please write the length of the width");
        Scanner scanner1 = new Scanner(System.in);
        double width = scanner.nextDouble();

        double area = width * length;
        double perimeter = 2 * (width + length);
        System.out.println("The Area of the rectangle is");
        System.out.println(area);
        System.out.println("Perimeter of the rectangle is");
        System.out.println(perimeter);


        double newlength = length * 2;
        double width_1 = width - 1;
        double area_1 = width_1 * newlength;
        double area_2 = area - area_1;
        Math.abs(area_2);
        System.out.println("This is the old calculate square");
        System.out.println(area);
        System.out.println("This is the new calculate square");
        System.out.println(area_1);
        System.out.println("This difference between the old one to the new one is" );

        System.out.println(area_2);

        }
    }

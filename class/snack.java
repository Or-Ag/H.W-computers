public class Snack
{
    private String name;
    private int grams;
    private int price;

    public String getName()
    {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public int getGrams() {
        return grams;
    }

    // פעולה שמעדכנת את הערך של num
    public  Snack(String name) {
        this.name = name;
        this.grams = grams;
        this.price = price;
    }
    public void displayProduct() {
        System.out.println( "What is the name of the snack?" + name);
        System.out.println( "what is the weight?" + grams);
        System.out.println( "How much does it cost?" + price );
    }
}



import java.util.Scanner;

public class Main{
    public static void main(String[] args)
    {
         int gramsnack = 0;
         int pricesnack = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("how much kids are in the party?");
        int n = scanner.nextInt();
        System.out.println("Hey, please tell the name of the snack");
        String namesnack = scanner.nextLine();
        for (int i = 1; i <= n; i++)
        {


            System.out.println("what is the weight of this snack?");
            gramsnack = scanner.nextInt();
            System.out.println("How much does it cost?");
            pricesnack = scanner.nextInt();

        }

        Snack snack = new Snack(namesnack + gramsnack + pricesnack);
        System.out.println(gramsnack+pricesnack);
        snack.displayProduct();
    }

}

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
}

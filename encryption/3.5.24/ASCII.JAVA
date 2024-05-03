import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter word");
        String Word = scan.nextLine();
        String reverse = "";
        char temporerychar;
        int tempnum, tempnumminus;
        for (int i = 0; i < Word.length(); i++) {
            temporerychar = Word.charAt(i);
            tempnum = (int) temporerychar - 97;
            tempnumminus = 122 - tempnum;
            temporerychar = (char) tempnumminus;
            reverse += temporerychar;
        }
        System.out.println(reverse);
    }
}

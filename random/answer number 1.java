
import  java.util.* ;
public class Main
{
    public static void main ( String[ ]  args ) {
        int mone = 0;

        Random rnd = new Random();
        for (int i = 1; i <= 50; i++) {
            int num = 1 + rnd.nextInt(6);
            System.out.println(num);
                if (num == 6)
                    mone++;}

        System.out.println("number 6 showes  " + mone);
    }
}

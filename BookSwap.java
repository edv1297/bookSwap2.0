import java.util.Scanner;

/**
 *
 *  BOOKSWAP: The Main method for the program
 *
 **/

public class BookSwap {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        System.out.println("Are you a BUYER or a SELLER?");
        String status = in.next().toLowerCase();

        if(status.equals("buyer")) {
            System.out.println(">What class are you looking for?");
            String course = in.next();
            System.out.println(">What section are you in?");
            int section = in.nextInt();

        } else if(status.equals("seller")) {
            System.out.println(">What class are you selling for?");
        } else {
            System.out.println(">Try again.");
        }

    }
}

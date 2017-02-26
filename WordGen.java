import java.util.Scanner;

/**
 *  SHIVAM PATEL / WEDNESDAY PM
 *
 *  LAB 2: Random Words, a program that mimics the writing style of a given input!
 *
 *  This class contains the main() method for the program
 *
 *  Textbook Problems:
 *   SC 3.2 - The add(v) method appends the value v to the end of the vector,
 *             while the add(i, v) method inserts v at index i, moving the
 *             existing elements to accommodate this shift.
 *   SC 3.3 - The add(i, v) method inserts a new value v into the vector, while
 *             the set(i,v) method reassigns the element value at i to v,
 *             returning the old value.
 *   SC 3.4 - The remove(v) method removes value v from the vector, returning v,
 *             while the remove(i) method removes the value at index i.
 *   P  3.6 - The primary advantage of having a special-purpose vector
 *             "BitVector" that stores only booleans, besides extensively
 *             simplifying the vector implementation, is that performing operations
 *             on the elements would be exceptionally fast because the data
 *             structure's operations would be invoked on a single type. Further, since
 *             booleans are primitive types, computers can perform operations on them much
 *             more quickly (they closely mirror data's internal inary state).
 *
 **/
 
public class WordGen {

    public static Scanner in = new Scanner(System.in);

    public static void main (String args[]) {
        if (args.length == 0) {
            // No args, so print usage line and do nothing else
            System.out.println ("Usage: java WordGen <level>");
        } else {
            if (k < 0) {
                System.out.println ("Error: You must specify a positive level!");
            } else {
                // Convert the first integer to k
                int k = Integer.parseInt(args[0]);

                // Read the input text
                StringBuffer textBuffer = new StringBuffer();
                while(in.hasNext()) {
                    String line = in.nextLine();
                    textBuffer.append(line);
                    textBuffer.append("\n");
                }
                String input = textBuffer.toString();
                
                // Build the table
                Table table = new Table (input, k);
                
                // Print a random string
                System.out.println(table.newRandom());
            }
        }
    }
}

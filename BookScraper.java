import java.util.Scanner;

public class BookScraper{

  public static void main (String args[])
  {
    String text = "";
    Scanner in = new Scanner (System.in);
    StringBuffer textBuffer = new StringBuffer();

    while(in.hasNextLine()){
      String line = in.nextLine();
      textBuffer.append(line);
      textBuffer.append("/n");
    }
    text = textBuffer.toString();
    getInfo(text);

}

    public static void getInfo (String text) {
      String title = "";
      String author = "";
      String ISBN = "";

      Scanner scan = new Scanner(text);

      while(scan.hasNext()){
        String candidate = scan.nextLine();
        if(candidate.contains(" Edition: ")){
          int end = candidate.indexOf(" Edition: ");
          title = candidate.substring(0,end);
        } else if (candidate.contains("Author: ")){
          author = candidate.substring(candidate.indexOf("Author: "));
        } else if(candidate.contains("ISBN: ")){
          String temp =candidate.substring(candidate.indexOf("ISBN: "));
          ISBN = temp;
          //modify how appropriate.
          Book a = new Book(title,author,ISBN);

          System.out.println(a.toString());
        }
      }
    }
  }

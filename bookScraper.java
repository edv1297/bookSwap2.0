import java.util.Scanner;

public class bookScraper{

    protected String text;
    protected static Scanner in;
    public static void main (String args[])
    {
	Scanner scan = new Scanner (System.in);
	StringBuffer textBuffer = new StringBuffer();

	while(scan.hasNextLine()){
	    String line = in.nextLine();
	    textBuffer.append(line);
	    textBuffer.append("/n");
	}
	text = textBuffer.toString();
	getInfo(text);

	    String title = "";
	    String author = "";
	    int ISBN = 0;
	    in = new Scanner(text);
	     
      
	    while(in.hasNext()){
		if(in.nextLine().contains(" Edition: ")){		
		    int end  = classInfo.indexOf(" Edition: ");
		    title = in.nextLine().subString(0,end);
		}else if(in.nextLine().contains("Author: ")){
		    author = in.nextLine().subString(classInfo.indexOf("Author: "));
		}
		else if(in,nextLine().contains("ISBN: ")){
		    String temp = in.nextLine().subString(classInfo.indexOf("ISBN: "));
		    System.out.println(temp);
		    ISBN = Integer.parseInt(temp);
		    //modify how appropriate.
		    Book a = new Book(title,author,ISBN,0.0);
		}
	    }	
    }
    
}


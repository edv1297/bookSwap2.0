import structure5.*;

public class BookDatabase {

    protected Vector <Association <Book, Vector<Listing>>> bookDatabase;

    /*
     *  The Constructor for the Listing Database, a vector of associations mapping
     *  Books to listing vectors
     */
    public BookDatabase(Book[] bookList) {
        bookDatabase = new Vector <Association <Book, Vector<Listing>>> ();

        // Load the books into the database
        for (int i = 0; i < bookList.length; i++) {
            bookDatabase.add(new Association <Book, Vector<Listing>>
              (bookList[i], new Vector <Listing> ()));
        }
    }

    public int bookToIndex(Book book) {
        for (int i = 0; i < bookDatabase.size(); i++) {
            Association <Book, Vector<Listing>> assoc = bookDatabase.get(i);
            if (assoc.getKey().equals(book)) {
                return bookDatabase.indexOf(assoc);
            }
        }

        return -1;
    }

    public void addListing(Listing l) {
        Book book = l.getBook();
        Association <Book,Vector<Listing>> assoc = bookDatabase.get(bookToIndex(book));
        assoc.getValue().add(l);
    }

    public String toString() {
        String output = "LISTINGS";

        for (int i = 0; i < bookDatabase.size(); i++) {
            output = output + "\n" + "{" + bookDatabase.get(i).getValue().toString() + "}";
        }
        return output;
    }


}

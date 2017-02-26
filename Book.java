public class Book {

      protected String title;
      protected String author;
      protected String isbn;


      public Book (String aTitle, String anAuthor, String anISBN) {
          //Edition default of 1?
          title = aTitle;
          author = anAuthor;
          isbn = anISBN;
      }

      public String getTitle() {
          return title;
      }

      public String getAuthor() {
          return author;
      }

      public String getISBN() {
          return isbn;
      }

      public String toString() {
          String s = this.getTitle() + " by " + this.getAuthor() + " (ISBN: " + this.getISBN()+ ")";
          return s;
      }

      public boolean equals (Book b) {
        if (b.getISBN().equals(isbn)) {
          return true;
        }
        return false;
      }
  }

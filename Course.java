public class Course {

    protected String title;
    protected int section;
    protected Book[] books;

    //course objects with a constructed array of book objects(filled from a scraper)
    public Course (String courseTitle, Book[] bookList, int aSection) {
        title = courseTitle;
        section = aSection;
        books = bookList;
    }

    public String getTitle() {
        return title;
    }

    public int getSection() {
        return section;
    }
    public void addBook(Book b){
      for (int i = 0; i < books.length - 1;++i){
        if(books[i]==null){
          books[i] = b;
          break;
        }
      }
    }

    public String toString() {
        String courseDescription = "Title: " + getTitle() + " Books required: ";

        for(int bookNum = 0; bookNum < books.length - 1; bookNum++) {
            courseDescription += (books[bookNum] + "\n");
        }

        return courseDescription;
    }
}

public class Listing {

    protected String name;
    protected Book book;
    protected String condition;
    protected double price;

    public Listing (String aName, Book aBook,String aCondition, double aPrice) {
        name = aName;
        book = aBook;
        condition = aCondition;
        price = aPrice;
    }

    public String getName(){
      return name;
    }
    public Book getBook(){
      return book;
    }
    public String getCondition(){
      return condition;
    }
    public double getPrice(){
      return price;
    }

    public String toString() {
        return getName()+ "wants to sell" + getBook().getTitle() + " for " + getPrice() +
        "Condition: " + getCondition();
    }
}

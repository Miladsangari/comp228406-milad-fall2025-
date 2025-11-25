public class MathBook extends Book {

    public MathBook(String title, String description, String author,
                    String publisher, String isbn, int year) {
        super(title, description, author, publisher, isbn, year);
    }

    // Use entered price directly
    @Override
    public void setPrice(double price) {
        storeComputedPrice(price);
    }

    @Override
    public String getGenre() {
        return "Math";
    }
}
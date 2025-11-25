public class ScienceBook extends Book {

    public ScienceBook(String title, String description, String author,
                       String publisher, String isbn, int year) {
        super(title, description, author, publisher, isbn, year);
    }

    // Apply 10% discount to entered base price
    @Override
    public void setPrice(double price) {
        double discounted = price - (price * 0.10);
        storeComputedPrice(discounted);
    }

    @Override
    public String getGenre() {
        return "Science";
    }
}
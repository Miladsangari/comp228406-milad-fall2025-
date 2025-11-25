import java.text.NumberFormat;

public abstract class Book {
    // instance variables
    private String title;
    private String description;
    private String author;
    private String publisher;
    private double price;   // handled only by subclasses
    private String isbn;
    private int year;

    // constructor for shared attributes
    public Book(String title, String description, String author,
                String publisher, String isbn, int year) {
        this.title = title;
        this.description = description;
        this.author = author;
        this.publisher = publisher;
        this.isbn = isbn;
        this.year = year;
    }

    // getters and setters (no normal setter for price)
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public String getPublisher() { return publisher; }
    public void setPublisher(String publisher) { this.publisher = publisher; }

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public double getPrice() { return price; }

    // subclasses call this to assign calculated price
    protected void storeComputedPrice(double value) {
        this.price = value;
    }

    // abstract requirements for subclasses
    public abstract void setPrice(double price);
    public abstract String getGenre();

    @Override
    public String toString() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return "[" + getGenre() + " Book]\n" +
                "Title: " + title + '\n' +
                "Desc: " + description + '\n' +
                "Author: " + author + '\n' +
                "Publisher: " + publisher + '\n' +
                "ISBN: " + isbn + '\n' +
                "Year: " + year + '\n' +
                "Price: " + currency.format(price);
    }
}
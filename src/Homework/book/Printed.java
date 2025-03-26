package Homework.book;

public class Printed extends Book {
    protected String type;
    protected int pages;
    protected String publisher;
    protected int copies;


    public Printed(int isbn, String title, double price, String author) {
        super(isbn, title, price, author);
        this.type= type;
        this.pages = pages;
        this.publisher = publisher;
        this.copies = copies;
    }
}

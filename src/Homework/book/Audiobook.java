package Homework.book;

public class Audiobook extends Book {
    protected double minutes;
    protected String Narator;

    public Audiobook(int isbn, String title, double price, String author) {
        super(isbn, title, price, author);
        this.Narator = Narator;
        this.minutes = minutes;
    }


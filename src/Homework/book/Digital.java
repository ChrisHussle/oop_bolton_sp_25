package Homework.book;


public class Digital extends Book {
    protected double size;

    public Digital(int isbn, String title, double price, String author) {
        super(isbn, title, price, author);
        this.size=size;
    }
    public static void addBook(){
        books.add(new Book (1,"Silence of the Lamps",40.0,"Jonathan Dame",1000));
}}

package Tutorial7.Q3_Q5;

import java.util.ArrayList;

public class Book{
    String title;
    double price;
    int year;
    String author;

    ArrayList<Book> books = new ArrayList<Book>();

    Book (String title, double price, int year, String author) {
        this.title = title;
        this.price = price;
        this.year = year;
        this.author = author;
    }

    public String toString () {
        String details = title + " " + price + " " + year + " " + author;
        return details;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

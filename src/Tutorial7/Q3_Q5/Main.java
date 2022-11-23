package Tutorial7.Q3_Q5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<Book>();
        String decision;
        String title;
        double price;
        int year;
        String author;
        Scanner s1 = new Scanner(System.in);
        Scanner  s2 = new Scanner(System.in);
        Scanner  s3 = new Scanner(System.in);

        while (true){
            System.out.println("Enter book title, price, year, author: ");
            System.out.println("Title: ");
            title = s1.nextLine();
            System.out.println("Price: ");
            price = s2.nextDouble();
            System.out.println("Year: ");
            year = s3.nextInt();
            System.out.println("Author: ");
            author = s1.nextLine();
            System.out.println("Decision: ");
            decision = s1.nextLine();

            Book book = new Book(title, price, year, author);
            books.add(book);

            if (decision.equals("no")) {
                break;
            }
        }

        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
        }

    }
}

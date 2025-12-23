import java.util.*;

class Book {
    String title;
    String author;
    double price;

    // default constructor
    Book() {
        title = "Not Assigned";
        author = "Unknown";
        price = 0.0;
    }

    // parameterized constructor
    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    // method to display book details
    void displayDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

public class BookAndAuthorDetails {
    public static void main(String[] args) {
        Book b1 = new Book(); // using default constructor
        Book b2 = new Book("Java Basics", "James Gosling", 499.50); // parameterized constructor

        b1.displayDetails();
        System.out.println();
        b2.displayDetails();
    }
}

import java.util.*;

class Product {
    // static variable shared by all products
    static double discount = 10.0; // discount percentage

    String productName;
    double price;
    int quantity;
    final int productID; // final: cannot be changed once assigned

    // constructor using this keyword
    Product(String productName, double price, int quantity, int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    // static method to update discount
    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    // instance method to display product details
    void displayDetails() {
        System.out.println("Product ID: " + productID);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: " + discount + "%");
    }
}

public class ShoppingCartSystem {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 60000, 1, 201);
        Product p2 = new Product("Headphones", 3000, 2, 202);

        Product.updateDiscount(15.0); // update discount for all products

        // instanceof check before processing details
        if (p1 instanceof Product) {
            p1.displayDetails();
        }

        System.out.println();

        if (p2 instanceof Product) {
            p2.displayDetails();
        }
    }
}

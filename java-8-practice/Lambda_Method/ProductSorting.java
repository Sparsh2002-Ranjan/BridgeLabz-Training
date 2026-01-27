
import java.util.*;

class Product {
    String name;
    double price;
    double rating;
    int discount;

    Product(String name, double price, double rating, int discount) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }
}

public class ProductSorting {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("Phone", 50000, 4.5, 10));
        list.add(new Product("Laptop", 80000, 4.7, 15));
        list.add(new Product("Headset", 3000, 4.2, 20));

        list.sort((a, b) -> Double.compare(a.price, b.price));
    }
}

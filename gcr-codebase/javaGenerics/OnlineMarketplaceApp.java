import java.util.*;

interface Category {
    String getCategoryName();
}

class BookCategory implements Category {
    public String getCategoryName() {
        return "Books";
    }
}

class ClothingCategory implements Category {
    public String getCategoryName() {
        return "Clothing";
    }
}

class GadgetCategory implements Category {
    public String getCategoryName() {
        return "Gadgets";
    }
}

class Product<T extends Category> {
    private final String name;
    private double price;
    private final T category;

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public T getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return name + " | " + category.getCategoryName() + " | Price: " + price;
    }
}

class Catalog {
    private final List<Product<? extends Category>> products = new ArrayList<>();

    public void addProduct(Product<? extends Category> product) {
        products.add(product);
    }

    public List<Product<? extends Category>> getProducts() {
        return products;
    }
}

class DiscountUtil {
    public static <T extends Product<? extends Category>> void applyDiscount(T product, double percentage) {
        double discountedPrice = product.getPrice() - (product.getPrice() * percentage / 100);
        product.setPrice(discountedPrice);
    }
}

public class OnlineMarketplaceApp {
    public static void main(String[] args) {
        Product<BookCategory> book =
                new Product<>("Java Mastery", 499.0, new BookCategory());

        Product<ClothingCategory> shirt =
                new Product<>("Cotton Shirt", 999.0, new ClothingCategory());

        Product<GadgetCategory> phone =
                new Product<>("Smartphone", 19999.0, new GadgetCategory());

        Catalog catalog = new Catalog();
        catalog.addProduct(book);
        catalog.addProduct(shirt);
        catalog.addProduct(phone);

        DiscountUtil.applyDiscount(book, 10);
        DiscountUtil.applyDiscount(phone, 5);

        for (Product<? extends Category> product : catalog.getProducts()) {
            System.out.println(product);
        }
    }
}

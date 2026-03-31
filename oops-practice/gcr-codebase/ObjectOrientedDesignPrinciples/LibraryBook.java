import java.util.*;
class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

class Library {
    private String libraryName;
    private ArrayList<Book> books;

    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public String getLibraryName() {
        return libraryName;
    }
}

public class LibraryBook {
    public static void main(String[] args) {
        Book book1 = new Book("C", "C");
        Book book2 = new Book("c++", "A");
        Book book3 = new Book("c#", "B");

        Library cityLib = new Library("City Library");
        Library townlib = new Library("College Library");

        cityLib.addBook(book1);
        cityLib.addBook(book2);

        townlib.addBook(book2);
        townlib.addBook(book3);
    }
}

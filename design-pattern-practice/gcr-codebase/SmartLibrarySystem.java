import java.util.*;

//OBSERVER
interface Observer {
    void update(String message);
}

interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers(String message);
}

//USER 
interface User extends Observer {
    String getName();
}

class Student implements User {
    private String name;

    Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void update(String message) {
        System.out.println("Student " + name + " notified: " + message);
    }
}

class Faculty implements User {
    private String name;

    Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void update(String message) {
        System.out.println("Faculty " + name + " notified: " + message);
    }
}

class Librarian implements User {
    private String name;

    Librarian(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void update(String message) {
        System.out.println("Librarian " + name + " notified: " + message);
    }
}

//FACTORY
class UserFactory {
    public static User createUser(String role, String name) {
        switch (role.toLowerCase()) {
            case "student": return new Student(name);
            case "faculty": return new Faculty(name);
            case "librarian": return new Librarian(name);
            default: throw new IllegalArgumentException("Invalid role");
        }
    }
}

//BUILDER
class Book {
    private String title;
    private List<String> authors;
    private String edition;
    private String genre;
    private String publisher;

    private Book(Builder builder) {
        this.title = builder.title;
        this.authors = builder.authors;
        this.edition = builder.edition;
        this.genre = builder.genre;
        this.publisher = builder.publisher;
    }

    public String getTitle() {
        return title;
    }

    static class Builder {
        private String title;
        private List<String> authors = new ArrayList<>();
        private String edition;
        private String genre;
        private String publisher;

        Builder(String title) {
            this.title = title;
        }

        Builder addAuthor(String author) {
            authors.add(author);
            return this;
        }

        Builder edition(String edition) {
            this.edition = edition;
            return this;
        }

        Builder genre(String genre) {
            this.genre = genre;
            return this;
        }

        Builder publisher(String publisher) {
            this.publisher = publisher;
            return this;
        }

        Book build() {
            return new Book(this);
        }
    }
}

//SINGLETON 
class LibraryCatalog implements Subject {
    private static LibraryCatalog instance;
    private List<Book> books = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    private LibraryCatalog() {}

    public static synchronized LibraryCatalog getInstance() {
        if (instance == null) {
            instance = new LibraryCatalog();
        }
        return instance;
    }

    public void addBook(Book book) {
        books.add(book);
        notifyObservers("Book added: " + book.getTitle());
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers(String message) {
        observers.forEach(o -> o.update(message));
    }
}

public class SmartLibrarySystem {
    public static void main(String[] args) {

        LibraryCatalog catalog = LibraryCatalog.getInstance();

        User u1 = UserFactory.createUser("student", "Aarav");
        User u2 = UserFactory.createUser("faculty", "DrMehta");

        catalog.registerObserver(u1);
        catalog.registerObserver(u2);

        Book book = new Book.Builder("Data Structures")
                .addAuthor("Cormen")
                .addAuthor("Leiserson")
                .edition("3rd")
                .genre("Computer Science")
                .publisher("MIT Press")
                .build();

        catalog.addBook(book);
    }
}

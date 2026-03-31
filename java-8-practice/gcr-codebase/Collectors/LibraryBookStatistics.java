
import java.util.*;
import java.util.stream.*;

class Book {
    private String genre;
    private int pages;

    Book(String genre, int pages) {
        this.genre = genre;
        this.pages = pages;
    }

    public String getGenre() { return genre; }
    public int getPages() { return pages; }
}

public class LibraryBookStatistics {
    public static void main(String[] args) {
        List<Book> books = List.of(
            new Book("Fiction", 300),
            new Book("Fiction", 450),
            new Book("Science", 500)
        );

        Map<String, IntSummaryStatistics> stats =
            books.stream()
            .collect(Collectors.groupingBy(
                Book::getGenre,
                Collectors.summarizingInt(Book::getPages)
            ));

        System.out.println(stats);
    }
}

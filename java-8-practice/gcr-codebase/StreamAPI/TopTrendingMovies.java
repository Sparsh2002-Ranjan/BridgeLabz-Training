
import java.util.*;
import java.util.stream.*;

class Movie {
    String name;
    double rating;
    int year;

    Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    public double getRating() { return rating; }
    public int getYear() { return year; }
    public String toString() { return name; }
}

public class TopTrendingMovies {
    public static void main(String[] args) {
        List<Movie> movies = List.of(
            new Movie("Alpha", 4.8, 2024),
            new Movie("Bravo", 4.5, 2023),
            new Movie("Charlie", 4.9, 2024),
            new Movie("Delta", 4.6, 2022),
            new Movie("Echo", 4.7, 2023),
            new Movie("Foxtrot", 4.4, 2024)
        );

        movies.stream()
              .sorted(Comparator.comparing(Movie::getRating).reversed()
              .thenComparing(Movie::getYear).reversed())
              .limit(5)
              .forEach(System.out::println);
    }
}

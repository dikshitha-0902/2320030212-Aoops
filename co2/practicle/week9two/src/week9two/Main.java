package week9two;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Create a list of movies
        ArrayList<Movie> movieList = new ArrayList<>();
        movieList.add(new Movie("Inception", 8.8, 2010));
        movieList.add(new Movie("The Dark Knight", 9.0, 2008));
        movieList.add(new Movie("Interstellar", 8.6, 2014));
        movieList.add(new Movie("The Prestige", 8.5, 2006));

        // Print movies before sorting
        System.out.println("Movies before sorting by year:");
        for (Movie movie : movieList) {
            System.out.println(movie);
        }

        // Sort movies by year of release
        Collections.sort(movieList);

        // Print movies after sorting
        System.out.println("\nMovies after sorting by year:");
        for (Movie movie : movieList) {
            System.out.println(movie);
        }
    }
}


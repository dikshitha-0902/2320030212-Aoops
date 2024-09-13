package week9two;
public class Movie implements Comparable<Movie> {
    private double rating;
    private String name;
    private int year;

    // Constructor
    public Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    // Getters for the attributes
    public double getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    // Override compareTo() to compare movies by year
    @Override
    public int compareTo(Movie otherMovie) {
        return this.year - otherMovie.getYear();
    }

    @Override
    public String toString() {
        return "Movie{" + "name='" + name + '\'' + ", rating=" + rating + ", year=" + year + '}';
    }
}


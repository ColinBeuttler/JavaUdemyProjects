package models;

import java.util.ArrayList;

public class Store {
    ArrayList<Movie> movies;

    public Store() {
        this.movies = new ArrayList<Movie>();
    }

    public Movie getMovies(int index) {
        return new Movie(movies.get(index));
    }

    public Movie getMovie(String name) {
        for (int i = 0; i < this.movies.size(); i++) {
            if (this.movies.get(i).getname().equals(name)) {
                return new Movie(this.movies.get(i));
            }
        }
        return null;
    }

    public void setMovies(Movie movies, int index) {
        this.movies.set(index, new Movie(movies));
    }

    public void addMovie(Movie movie) {
        this.movies.add(new Movie(movie));
    }

    public void action(String name, String action) {
        if (movies.isEmpty()) {
            throw new IllegalStateException("Cannot sell or rent from empty list.");
        }
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("name cannot be null or blank.");
        }
        for (int i = 0; i < this.movies.size(); i++) {
            if (this.movies.get(i).getname().equals(name)) {
                switch (action) {
                    case "sell": {
                        if (!movies.get(i).isAvailable()) {
                            throw new IllegalStateException("Cannot sell a movie that is currently rented.");
                        }
                        movies.remove(i);
                        break;
                    }
                    case "return": {
                        movies.get(i).setAvailable(true);
                        break;
                    }
                    case "rent": {
                        movies.get(i).setAvailable(false);
                        break;
                    }
                    default: {
                    System.out.print("not a valid action");
                }
               } 
            }
        }
    }

    public String toString() {
        String temp = "";
        for (int i = 0; i < movies.size(); i++) {
            temp += this.movies.get(i).toString();
            temp += "\n\n";
        }
        return temp;
   }

}

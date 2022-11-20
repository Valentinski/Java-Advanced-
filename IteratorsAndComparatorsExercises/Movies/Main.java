package IteratorsAndComparatorsExercises.Movies;

import IteratorsAndComparatorsExercises.Movies.Movie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();

        Movie movie1 = new Movie("Titatanik", 15, 10);
        Movie movie2 = new Movie("Lord of the ring  ", 25, 10);
        Movie movie3 = new Movie("A Softuni MOvie", 35, 5);

        movies.add(movie1);
        movies.add(movie2);

        MovieNameComparator byName = new MovieNameComparator();
        MovieBudgetComparator byBudget = new MovieBudgetComparator();

        Collections.sort(movies, byName);
        Collections.sort(movies, byBudget);

        List<String> list = new ArrayList<>();
        list.add("Asen");
        list.add("Gogoooo");
        list.add("Steff");

        Collections.sort(list, new StringCompareByLength());
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println();
    }
}

package com.example.recycleview;

import java.util.ArrayList;
import java.util.List;

public class CreateMovieList {
    public static ArrayList<Movie> generateMovies(){
        ArrayList<Movie> movies= new ArrayList<Movie>();
        movies.add(new Movie(R.drawable.batman, "The dark knight", "Action", "2h 32min"));
        movies.add(new Movie(R.drawable.frozen, "Frozen", "Animation", "1h 49min"));
        movies.add(new Movie(R.drawable.jaws, "Jaws", "Horror", "2h 10min"));
        movies.add(new Movie(R.drawable.sonig, "Sonic the Hedgehog", "Family", "1h 40min"));

        return movies;
    }
}

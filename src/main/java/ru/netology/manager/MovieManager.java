package ru.netology.manager;
public class MovieManager {
    private String[] movies = new String[0];
    private String[] tmp;

    public void addMovies(String movie) {
        String[] tap = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] =movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }
    public String[] findAll() {
        return movies;
    }
}

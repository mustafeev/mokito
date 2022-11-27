package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.testng.asserts.Assertion;

public class MovieManagerTest {

    @Test
    public void shouldADDMovies() {
        MovieManager manager = new MovieManager();
        manager.addMovies("Film 1");
        manager.addMovies("Film 2");
        manager.addMovies("Film 3");
        manager.addMovies("Film 4");
        String[] actual = manager.findAll();
        String[] expected = {"Film 1, Film 2, Film 3, Film 4"};


        Assertions.assertArrayEquals(expected, actual);
    }
}

package src.test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.Before;
import org.junit.Test;

import src.main.models.Store;
import src.main.models.Movie;

public class StoreTest {

    Store store;

    /**
     * 
     */
    @Before
    public void setUp() {
        store = new Store();
        store.addMovie(new Movie("The Shawshank Redemption", "Blue-Ray", 9.2));
        store.addMovie(new Movie("The Godfather", "Blue-Ray", 9.1));
        

    }

    /**
     * @return
     */
    @Test
    public void movieAdded() {
        assertTrue(store.contains(new Movie("The Godfather", "Blue-Ray", 9.1)));
    }

    // @Test
    // public void sellMovieTest() {
    //     store.sellMovie("The Godfather");
    //     assertFalse(store.contains(new Movie("The Godfather", "Blue-Ray", 9.1)));
    // }

    @Test
    public void rentMovieTest() {
        store.rentMovie("The Shawshank Redemption");
        assertFalse(store.getMovie(0).isAvailable());
    }

    @Test
    public void returnMovieTest() {
        store.returnMovie("The Shawshank Redemption");
        assertTrue(store.getMovie(0).isAvailable());
    }

    @Test(expected = IllegalStateException.class)
    public void movieNotInStock() {
        store.rentMovie("The Godfather");
        store.sellMovie("The Godfather");
        
    }
}



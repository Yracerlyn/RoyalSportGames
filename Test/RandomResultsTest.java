package Test;

import Random_Generator.RandomResults;
import org.junit.Test;
import static org.junit.Assert.*;

public class RandomResultsTest {

    @Test
    public void testGetRandomWinner() {
        int result = RandomResults.getRandomWinner();
        assertTrue(result == 0 || result == 1); // Vérifie que le résultat est soit 0, soit 1.
    }

    @Test
    public void testGetBaskettballRandomResult() {
        int result = RandomResults.getBaskettballRandomResult();
        assertTrue(result >= 60 && result <= 100); // Vérifie que le résultat est compris entre 60 et 100 inclus.
    }

    @Test
    public void testGetSetRandomResult() {
        int result = RandomResults.getSetRandomResult();
        assertTrue(result >= 0 && result <= 2); // Vérifie que le résultat est compris entre 0 et 2 inclus.
    }

    @Test
    public void testGetFootballRandomResult() {
        int result = RandomResults.getFootballRandomResult();
        assertTrue(result >= 0 && result <= 5); // Vérifie que le résultat est compris entre 0 et 5 inclus.
    }

}
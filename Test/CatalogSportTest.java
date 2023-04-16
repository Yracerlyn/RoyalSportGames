package Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import Game_Engine.CatalogSport;
import org.junit.Test;

public class CatalogSportTest {

    @Test
    public void testFoundSportRound() {
        // Test finding sport for each round
        assertEquals("football", CatalogSport.foundSportRound(1));
        Set<String> sports = new HashSet<>(Arrays.asList("basketball", "volleyball"));
        assertTrue(sports.contains(CatalogSport.foundSportRound(3)));
        sports = new HashSet<>(Arrays.asList("swimming", "kayak", "running"));
        assertTrue(sports.contains(CatalogSport.foundSportRound(4)));
        sports = new HashSet<>(Arrays.asList("petanque", "beachvolley"));
        assertTrue(sports.contains(CatalogSport.foundSportRound(5)));
        sports = new HashSet<>(Arrays.asList("swimming", "kayak", "running"));
        assertTrue(sports.contains(CatalogSport.foundSportRound(6)));
        assertEquals("tabletennis", CatalogSport.foundSportRound(7));
    }

}
package Test;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import Sport.CollectiveContent.PetanqueOpposition;
import org.junit.Before;
import org.junit.Test;

import Participant.Player;
import Sport.CollectiveContent.BeachVolleyOpposition;
import Sport.CollectiveSport;

public class PetanqueOppositionTest {

    private ArrayList<Player> players;
    private CollectiveSport petanqueOpposition;

    @Before
    public void setUp() {
        players = new ArrayList<>();
        for (int i = 1; i <= 4; i++) {
            players.add(new Player(i));
        }
        petanqueOpposition = new PetanqueOpposition(players);
    }

    @Test
    public void setResultTest() {
        petanqueOpposition.setRandomResult();
        int[] result = petanqueOpposition.getResult();
        assertTrue(result[0] >= 0 && result[0] <= 3);
        assertTrue(result[1] >= 0 && result[1] <= 3);
    }

}
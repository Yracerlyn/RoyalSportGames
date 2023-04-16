package Test;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import Sport.CollectiveContent.VolleyballOpposition;
import org.junit.Before;
import org.junit.Test;

import Participant.Player;
import Sport.CollectiveSport;

public class VolleyOppositionTest {

    private ArrayList<Player> players;
    private CollectiveSport volleyOpposition;

    @Before
    public void setUp() {
        players = new ArrayList<>();
        for (int i = 1; i <= 4; i++) {
            players.add(new Player(i));
        }
        volleyOpposition = new VolleyballOpposition(players);
    }

    @Test
    public void setResultTest() {
        volleyOpposition.setRandomResult();
        int[] result = volleyOpposition.getResult();
        assertTrue(result[0] >= 0 && result[0] <= 3);
        assertTrue(result[1] >= 0 && result[1] <= 3);
    }

}
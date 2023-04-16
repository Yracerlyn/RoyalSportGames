package Test;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import Participant.Player;
import Sport.CollectiveContent.BeachVolleyOpposition;
import Sport.CollectiveSport;

public class BeachVolleyOppositionTest {

    private ArrayList<Player> players;
    private CollectiveSport beachVolleyOpposition;

    @Before
    public void setUp() {
        players = new ArrayList<>();
        for (int i = 1; i <= 4; i++) {
            players.add(new Player(i));
        }
        beachVolleyOpposition = new BeachVolleyOpposition(players);
    }

    @Test
    public void setResultTest() {
        beachVolleyOpposition.setRandomResult();
        int[] result = beachVolleyOpposition.getResult();
        assertTrue(result[0] >= 0 && result[0] <= 3);
        assertTrue(result[1] >= 0 && result[1] <= 3);
    }

}
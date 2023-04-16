package Test;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import Sport.CollectiveContent.BasketballOpposition;
import org.junit.Before;
import org.junit.Test;

import Participant.Player;
import Sport.CollectiveSport;

public class BasketballOppositionTest {

    private ArrayList<Player> players;
    private CollectiveSport basketballOpposition;

    @Before
    public void setUp() {
        players = new ArrayList<>();
        for (int i = 1; i <= 4; i++) {
            players.add(new Player(i));
        }
        basketballOpposition = new BasketballOpposition(players);
    }

    @Test
    public void setResultTest() {
        basketballOpposition.setRandomResult();
        int[] result = basketballOpposition.getResult();
        assertTrue(result[0] >= 60 && result[0] <= 100);
        assertTrue(result[1] >= 60 && result[1] <= 100);
    }

}
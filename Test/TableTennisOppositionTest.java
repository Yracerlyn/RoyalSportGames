package Test;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import Sport.DuelSport;
import Sport.Duel_Content.TableTennisOpposition;
import org.junit.Before;
import org.junit.Test;

import Participant.Player;

public class TableTennisOppositionTest {

    private ArrayList<Player> players;
    private DuelSport tableTennisOpposition;

    @Before
    public void setUp() {
        players = new ArrayList<>();
        for (int i = 1; i <= 2; i++) {
            players.add(new Player(i));
        }
        tableTennisOpposition = new TableTennisOpposition(players);
    }

    @Test
    public void setResultTest() {
        tableTennisOpposition.setRandomResult();
        int[] result = tableTennisOpposition.getResult();
        assertTrue(result[0] >= 0 && result[0] <= 3);
        assertTrue(result[1] >= 0 && result[1] <= 3);
    }

}
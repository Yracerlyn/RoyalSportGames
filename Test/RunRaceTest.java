package Test;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;
import Participant.Player;
import Sport.Race_Content.RunRace;

public class RunRaceTest {

    @Test
    public void testGetWinners() {
        ArrayList<Player> players = new ArrayList<>();
        players.add(new Player(1));
        players.add(new Player(2));
        players.add(new Player(3));
        RunRace race = new RunRace(players, 2);

        // simulate a race and set the ranking
        ArrayList<Player> ranking = new ArrayList<>();
        ranking.add(players.get(1));
        ranking.add(players.get(0));
        ranking.add(players.get(2));
        race.setClassement(ranking);

        // check that the first two players are the winners
        ArrayList<Player> winners = race.getWinners();
        assertEquals(2, winners.size());
        assertEquals(2, winners.get(0).getId());
        assertEquals(1, winners.get(1).getId());
    }

    @Test
    public void testGetLosers() {
        ArrayList<Player> players = new ArrayList<>();
        players.add(new Player(1));
        players.add(new Player(2));
        players.add(new Player(3));
        RunRace race = new RunRace(players, 2);

        // simulate a race and set the ranking
        ArrayList<Player> ranking = new ArrayList<>();
        ranking.add(players.get(1));
        ranking.add(players.get(0));
        ranking.add(players.get(2));
        race.setClassement(ranking);

        // check that the last player is the only loser
        ArrayList<Player> losers = race.getLosers();
        assertEquals(1, losers.size());
        assertEquals(3, losers.get(0).getId());
    }
}

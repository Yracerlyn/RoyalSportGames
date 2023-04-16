package Test;

import Game_Engine.MatchGenerator;
import Participant.Player;
import Sport.CollectiveContent.BasketballOpposition;
import Sport.CollectiveSport;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


public class MatchGeneratorTest {

    @Test
    void testMakeMatchs() {
        // Création de joueurs
        ArrayList<Player> players = new ArrayList<>();
        for(int i=0; i<12; i++){
            players.add(new Player(i));
        }
        // Test pour le basket-ball
        MatchGenerator matchGenerator = new MatchGenerator(players);
        ArrayList<CollectiveSport> matchs = matchGenerator.makeMatchs("basketball");
        assertEquals(1, matchs.size());
        assertEquals(BasketballOpposition.class, matchs.get(0).getClass());
    }

    @Test
    void testPickPlayers() {
        // Création de joueurs
        ArrayList<Player> players = new ArrayList<>();
        for(int i=0; i<12; i++){
            players.add(new Player(i));
        }

        // Test pour sélectionner 4 joueurs
        MatchGenerator matchGenerator = new MatchGenerator(players);
        ArrayList<Player> matchPlayers = (ArrayList<Player>) matchGenerator.pickPlayers(4);
        assertEquals(4, matchPlayers.size());
    }

}
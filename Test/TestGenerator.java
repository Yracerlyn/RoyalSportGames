package Test;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

import Participant.Player;
import Random_Generator.RandomClassement;

public class TestGenerator {

    @Test
    public void testGenerateRandomClassement() {
        ArrayList<Player> players = new ArrayList<>();
        for(int i=1; i<=110; i++){
            players.add(new Player(i));
        }

        ArrayList<Player> classement = RandomClassement.generateRandomClassement(players);
        assertEquals(110, classement.size());

        // vérifier qu'il n'y a pas de doublons dans la liste générée
        for(int i=0; i<classement.size(); i++) {
            Player currentPlayer = classement.get(i);
            for(int j=i+1; j<classement.size(); j++) {
                assertNotEquals(currentPlayer.getId(), classement.get(j).getId());
            }
        }
    }
}

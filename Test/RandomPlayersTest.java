package Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import Random_Generator.RandomPlayers;
import org.junit.Test;

import Participant.Player;

public class RandomPlayersTest {

    @Test
    public void testGenerateRandomPlayers() {
        ArrayList<Player> players = RandomPlayers.generateRandomPlayers();
        assertEquals(110, players.size()); // Vérifie qu'il y a bien 110 joueurs générés

        // Vérifie que chaque joueur a un ID unique entre 1 et 110
        for (Player player : players) {
            assertTrue(player.getId() >= 1 && player.getId() <= 110);
            for (Player otherPlayer : players) {
                if (player != otherPlayer) {
                    assertTrue(player.getId() != otherPlayer.getId());
                }
            }
        }
    }
}
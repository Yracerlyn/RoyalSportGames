package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashSet;

import org.junit.jupiter.api.Test;

import Participant.Player;
import Random_Generator.RandomClassement;

class RandomClassementTest{
    @Test
    void testGenerateRandomClassement() {
        ArrayList<Player> players = new ArrayList<>();
        for(int i=1; i<=10; i++){
            players.add(new Player(i));
        }

        ArrayList<Player> classement = RandomClassement.generateRandomClassement(players);

        // Vérification de la taille de la liste
        assertEquals(10, classement.size());

        // Vérification de l'unicité des éléments dans le classement
        HashSet<Player> uniquePlayers = new HashSet<>(classement);
        assertEquals(10, uniquePlayers.size());

        // Vérification que tous les joueurs sont présents dans le classement
        for (Player player : players) {
            assertTrue(classement.contains(player));
        }
    }

}
package Test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;

import Participant.Player;
import Participant.Team;

public class TeamTest {

    @Test
    public void testSize() {
        // Créer une collection de joueurs
        Collection<Player> players = new ArrayList<>();
        players.add(new Player(1));
        players.add(new Player(2));
        players.add(new Player(3));

        // Créer une équipe à partir de la collection de joueurs
        Team team = new Team(players);

        // Vérifier que la méthode size() renvoie la bonne taille de l'équipe
        assertEquals(3, team.size());
    }

}
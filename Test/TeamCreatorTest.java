package Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import Participant.Player;
import Participant.Team;
import Participant.TeamCreator;

public class TeamCreatorTest {

    @Test
    public void testMakeTwoTeams() {
        // Création d'une liste de joueurs
        ArrayList<Player> players = new ArrayList<>();
        for(int i = 1; i <= 10; i++){
            players.add(new Player(i));
        }

        // Appel de la méthode pour créer les deux équipes
        Team[] teams = TeamCreator.makeTwoTeams(players);

        // Vérification que les deux équipes ont bien été créées
        assertNotNull(teams);
        assertEquals(2, teams.length);

        // Vérification que chaque équipe a le bon nombre de joueurs
        assertEquals(5, teams[0].size());
        assertEquals(5, teams[1].size());

        // Vérification que chaque joueur est présent dans une équipe
        for(Player player : players) {
            boolean found = false;
            for(Team team : teams) {
                if(team.getPlayers().contains(player)) {
                    found = true;
                    break;
                }
            }
            assertTrue(found);
        }
    }
}
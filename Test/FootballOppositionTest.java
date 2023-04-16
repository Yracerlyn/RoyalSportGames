package Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import Participant.Player;
import Sport.CollectiveContent.FootballOpposition;

public class FootballOppositionTest {

    private FootballOpposition footballOpposition;
    private List<Player> players;

    @Before
    public void setUp() {
        // Initialisation des joueurs
        Player player1 = new Player(1);
        Player player2 = new Player(2);
        Player player3 = new Player(3);
        Player player4 = new Player(4);

        // Ajout des joueurs à la liste des joueurs de l'équipe
        players = new ArrayList<Player>();
        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);

        // Initialisation de l'équipe
        footballOpposition = new FootballOpposition(players);
    }

    @Test
    public void testSetRandomResult() {
        // Appel de la méthode pour générer un résultat aléatoire
        footballOpposition.setRandomResult();

        // Vérification que les scores sont bien compris entre 0 et 5 inclus
        assertTrue(footballOpposition.getResult()[0] >= 0 && footballOpposition.getResult()[0] <= 5);
        assertTrue(footballOpposition.getResult()[1] >= 0 && footballOpposition.getResult()[1] <= 5);
    }

}
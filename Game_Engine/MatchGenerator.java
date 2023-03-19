package Game_Engine;

import java.util.ArrayList;
import java.util.Collection;
import Participant.Player;
import Participant.Team;
import Participant.TeamCreator;
import Sport.CollectiveSport;
import Sport.CollectiveContent.BasketballOpposition;
import Sport.CollectiveContent.BeachVolleyOpposition;
import Sport.CollectiveContent.FootballOpposition;
import Sport.CollectiveContent.PetanqueOpposition;
import Sport.CollectiveContent.VolleyballOpposition;
import Sport.SportProprieties.Basketball;
import Sport.SportProprieties.BeachVolley;
import Sport.SportProprieties.Football;
import Sport.SportProprieties.Petanque;
import Sport.SportProprieties.Volleyball;

public class MatchGenerator {
    private ArrayList<Player> players;

    public MatchGenerator(ArrayList<Player> players) {
        this.players = players;
    }

    public ArrayList<CollectiveSport> makeMatchs(String nameSport) {
        int nbPlayersForEachMatch;
        int nbOfMatchs;
        ArrayList<CollectiveSport> matchs = new ArrayList<>();
        switch (nameSport) {
            case "basketball":
                nbPlayersForEachMatch = Basketball.getNbOfPlayer();
                nbOfMatchs = this.players.size() / nbPlayersForEachMatch;
                for (int i=0; i<nbOfMatchs; i++) {
                    Collection<Player> matchPlayers = this.pickPlayers(nbPlayersForEachMatch);
                    Team[] teams = TeamCreator.makeTwoTeams(matchPlayers);
                    matchs.add(new BasketballOpposition(matchPlayers));
                    matchs.get(i).setAllTeams(teams);
                }
                break;

            case "football":
                nbPlayersForEachMatch = Football.getNbOfPlayer();
                nbOfMatchs = this.players.size() / nbPlayersForEachMatch;
                for(int i=0; i<nbOfMatchs; i++){
                    Collection<Player> matchPlayers = this.pickPlayers(nbPlayersForEachMatch);
                    Team[] teams = TeamCreator.makeTwoTeams(matchPlayers);
                    matchs.add(new FootballOpposition(matchPlayers));
                    matchs.get(i).setAllTeams(teams);
                }
                break;

            case "beachvolley":
                nbPlayersForEachMatch = BeachVolley.getNbOfPlayer();
                nbOfMatchs = this.players.size() / nbPlayersForEachMatch;
                for (int i=0; i<nbOfMatchs; i++) {
                    Collection<Player> matchPlayers = this.pickPlayers(nbPlayersForEachMatch);
                    Team[] teams = TeamCreator.makeTwoTeams(matchPlayers);
                    matchs.add(new BeachVolleyOpposition(matchPlayers));
                    matchs.get(i).setAllTeams(teams);
                }
                break;

            case "petanque":
                nbPlayersForEachMatch = Petanque.getNbOfPlayer();
                nbOfMatchs = this.players.size() / nbPlayersForEachMatch;
                for (int i=0; i<nbOfMatchs; i++) {
                    Collection<Player> matchPlayers = this.pickPlayers(nbPlayersForEachMatch);
                    Team[] teams = TeamCreator.makeTwoTeams(matchPlayers);
                    matchs.add(new PetanqueOpposition(matchPlayers));
                    matchs.get(i).setAllTeams(teams);
                }
                break;

            default:
                nbPlayersForEachMatch = Volleyball.getNbOfPlayer();
                nbOfMatchs = this.players.size() / nbPlayersForEachMatch;
                for (int i=0; i<nbOfMatchs; i++) {
                    Collection<Player> matchPlayers = this.pickPlayers(nbPlayersForEachMatch);
                    Team[] teams = TeamCreator.makeTwoTeams(matchPlayers);
                    matchs.add(new VolleyballOpposition(matchPlayers));
                    matchs.get(i).setAllTeams(teams);
                }
                break;
        }

        return matchs;

    }


    public Collection<Player> pickPlayers(int nbOfPlayerToPick) {
        Collection<Player> matchPlayers = new ArrayList<>();

        for (int i = 0; i < nbOfPlayerToPick; i++) {
            matchPlayers.add(this.players.get(0));
            this.players.remove(this.players.get(0));
        }
        return matchPlayers;
    }

}

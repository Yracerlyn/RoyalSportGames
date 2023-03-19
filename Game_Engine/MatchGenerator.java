package Game_Engine;

import java.util.ArrayList;
import java.util.Collection;

import Participant.Player;
import Participant.Team;
import Participant.TeamCreator;
import Sport.CollectiveSport;


public class MatchGenerator {
    private ArrayList<Player> players;
    
    public MatchGenerator(ArrayList<Player> players){
        this.players = players;
    }
    
    public CollectiveSport[] makeMatchs(int nbOfPlayers){
            
            int nbOfMatchs = this.players.size() / nbOfPlayers;
            CollectiveSport[] matchs = new CollectiveSport[nbOfMatchs];

            for(CollectiveSport match : matchs){
                Collection<Player> matchPlayers = this.pickPlayers(nbOfPlayers);
                Team[] teams = TeamCreator.makeTwoTeams(matchPlayers);
                match.setAllTeams(teams);
            }

            return matchs;
    }

    public Collection<Player> pickPlayers(int nbOfPlayerToPick){
        Collection<Player> matchPlayers = new ArrayList<>();
        
        for(int i=0; i < nbOfPlayerToPick; i++){
            matchPlayers.add(this.players.get(i));
            this.players.remove(this.players.get(i));
        }
        
        return matchPlayers;
    }
    
}

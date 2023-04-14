package Competition;

import java.util.Collection;

import Game_Engine.CatalogSport;
import Participant.Player;

public class RoundHandler {
    private RoyalSportGamesCompetition competition;
        
    // injection de dépendances
    private CompetitionMatchMaking matchMaking;    

    public RoundHandler(RoyalSportGamesCompetition competition){
        this.competition = competition;

        this.matchMaking = new CompetitionMatchMaking(competition);
    }

    
    public void startRound(){
        String nameSport = CatalogSport.foundSportRound(this.competition.getCurrentRound());

        if(this.competition.getNumberOfPlayerInGame() == 2){
            this.matchMaking.makeFinalContent();
        }
        
        else if(this.competition.getCurrentRound() % 2 != 0){
            this.matchMaking.makeCollectiveContents(nameSport);                        
        }

        else{
            this.matchMaking.makeIndvidualContents(nameSport);
        }
    
    }

    public void goToNextRound(){
        this.updateCurrentPlayers();
        this.setNextRound();
    }

    private void updateCurrentPlayers(){
        Collection<Player> winners = this.competition.getWinnersOfLastRound();
        this.competition.setPlayers(winners);
    }

    private void setNextRound(){
        int previousRound = this.competition.getCurrentRound();
        this.competition.setCurrentRound(previousRound + 1);
    }
}

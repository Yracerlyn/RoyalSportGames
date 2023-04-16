package Competition_Handler;

import Competition.RoundResult;
import Competition.RoyalSportGamesCompetition;
import Participant.Player;

import java.util.Collection;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Historic {
    RoyalSportGamesCompetition competition;

    public Historic(RoyalSportGamesCompetition competition){
        this.competition = competition;
    }

    public int searchLastRoundOfPlayer(int idPlayer){
        for(RoundResult roundResult : this.competition.getRoundResults()){
            for(Player loser : roundResult.getLosers()){
                if(idPlayer == loser.getId()){
                    return roundResult.getRound();
                }
            }
        }
        return 0;
    } 
}

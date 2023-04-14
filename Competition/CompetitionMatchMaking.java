package Competition;

import java.util.ArrayList;
import java.util.Collection;

import Game_Engine.MatchGenerator;
import Game_Engine.RoundLimit;
import Participant.Player;
import Random_Generator.RandomClassement;
import Sport.CollectiveSport;
import Sport.DuelSport;
import Sport.IndividualSport;
import Sport.Duel_Content.TableTennisOpposition;
import Sport.Race_Content.BikeRace;
import Sport.Race_Content.KayakRace;
import Sport.Race_Content.RunRace;
import Sport.Race_Content.SwimmingRace;

public class CompetitionMatchMaking {
    private RoyalSportGamesCompetition competition;
    
    public CompetitionMatchMaking(RoyalSportGamesCompetition competition){
        this.competition = competition;
    }

    public void makeCollectiveContents(String nameSport){
        MatchGenerator matchGenerator = new MatchGenerator((ArrayList<Player>)this.competition.getPlayers());
        ArrayList<CollectiveSport> matchs = matchGenerator.makeMatchs(nameSport);  
        
        Collection<Player> winners = new ArrayList<>();
        Collection<Player> losers = new ArrayList<>();             
        
        for(CollectiveSport match : matchs){                
            match.setRandomResult();
            winners.addAll(match.getWinners());
            losers.addAll(match.getLosers());
        }
        
        int currentRound = this.competition.getCurrentRound();
        this.competition.setRoundResult(nameSport, currentRound, winners, losers);
        }

    public void makeFinalContent(){
        DuelSport duel = new TableTennisOpposition((ArrayList<Player>)this.competition.getPlayers());
        duel.setRandomResult();
        int currentRound = this.competition.getCurrentRound();
        this.competition.setRoundResult("Table Tennis", currentRound, duel.getWinners(), duel.getLosers());
    }

    public void makeIndvidualContents(String nameSport){
        int nbPlayerLimit = RoundLimit.foundPlayerLimit(this.competition.getCurrentRound());
        IndividualSport race;
            ArrayList<Player> individualPlayers = (ArrayList<Player>)this.competition.getPlayers();
            switch(nameSport){
                case "bike" :
                    race = new BikeRace(individualPlayers, nbPlayerLimit);
                    break;
                case "kayak" :
                    race = new KayakRace(individualPlayers, nbPlayerLimit);
                    break;
                case "swimming" :
                    race = new SwimmingRace(individualPlayers, nbPlayerLimit);
                    break;
                default :
                    race = new RunRace(individualPlayers, nbPlayerLimit);
            }
    
            race.setClassement(RandomClassement.generateRandomClassement(individualPlayers));
            this.competition.setRoundResult(nameSport, this.competition.getCurrentRound(), race.getWinners(), race.getLosers());
    }
}

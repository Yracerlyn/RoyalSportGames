package Main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import Game_Engine.CatalogSport;
import Game_Engine.MatchGenerator;
import Game_Engine.RoundLimit;
import Participant.Player;
import Sport.CollectiveSport;
import Sport.IndividualSport;
import Sport.CollectiveContent.BasketballOpposition;
import Sport.CollectiveContent.BeachVolleyOpposition;
import Sport.CollectiveContent.FootballOpposition;
import Sport.CollectiveContent.PetanqueOpposition;
import Sport.CollectiveContent.VolleyballOpposition;
import Sport.Race_Content.BikeRace;
import Sport.Race_Content.RunRace;
import Sport.SportProprieties.Basketball;
import Sport.SportProprieties.BeachVolley;
import Sport.SportProprieties.Football;
import Sport.SportProprieties.Petanque;
import Sport.SportProprieties.Volleyball;

public class Main {
    public static void main(String[] args) {
        ArrayList<Player> players = new ArrayList<>();
        for(int i=1; i<=110; i++){
            players.add(new Player(i));
        }

        int round = 1;

        while(players.size() > 1){
        
            ArrayList<Player> winners = new ArrayList<>();
            ArrayList<Player> losers = new ArrayList<>();
            String nameSport = CatalogSport.foundSportRound(round);

            if(players.size() == 2){

            }
            else if(round % 2 != 0){
                MatchGenerator matchGenerator = new MatchGenerator(players);
                CollectiveSport[] matchs;
                int nbPlayersForEachMatch;
                switch (nameSport) {
                    case "basketball":
                        nbPlayersForEachMatch = Basketball.getNbOfPlayer();
                        matchs = matchGenerator.makeMatchs(nbPlayersForEachMatch);
                        for(CollectiveSport match : matchs){
                            match = (BasketballOpposition) match;                            
                        }
                        break;
                    case "football" :
                        nbPlayersForEachMatch = Football.getNbOfPlayer();
                        matchs = matchGenerator.makeMatchs(nbPlayersForEachMatch);
                        for(CollectiveSport match : matchs){
                            match = (FootballOpposition) match;
                        }
                        break;

                    case "beachvolley" :
                        nbPlayersForEachMatch = BeachVolley.getNbOfPlayer();
                        matchs = matchGenerator.makeMatchs(nbPlayersForEachMatch);
                        for(CollectiveSport match : matchs){
                            match = (BeachVolleyOpposition) match;
                        }
                        break;
                    case "petanque" :
                        nbPlayersForEachMatch = Petanque.getNbOfPlayer();
                        matchs = matchGenerator.makeMatchs(nbPlayersForEachMatch);
                        for(CollectiveSport match : matchs){
                            match = (PetanqueOpposition) match;
                        }
                        break;
                    default :
                        nbPlayersForEachMatch = Volleyball.getNbOfPlayer();
                        matchs = matchGenerator.makeMatchs(nbPlayersForEachMatch);
                        for(CollectiveSport match : matchs){
                            match = (VolleyballOpposition) match;
                        }
                        break;
                    
                }
                
                for(CollectiveSport match : matchs){                
                    match.setRandomResult();
                    winners.addAll(match.getWinners());
                    losers.addAll(match.getLosers());
                }
                                               
            }

            else{
                int nbPlayerLimit = RoundLimit.foundPlayerLimit(round);
                IndividualSport race;
                switch(nameSport){
                    case "bike" :
                        race = new BikeRace(players, nbPlayerLimit);
                        break;
                    case "kayak" :
                        race = new BikeRace(players, nbPlayerLimit);
                        break;
                    case "swimming" :
                        race = new BikeRace(players, nbPlayerLimit);
                        break;
                    default :
                        race = new RunRace(players, nbPlayerLimit);
                }
                winners = race.getWinners();
                losers = race.getLosers();

            }

            players = winners;
            round ++;
        }

        System.out.println(players.get(0).getId() + "a gagné");
        
    }
}
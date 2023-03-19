package Main;

import java.util.ArrayList;

import Game_Engine.CatalogSport;
import Game_Engine.MatchGenerator;
import Participant.Player;
import Sport.CollectiveSport;
import Sport.CollectiveContent.BasketballOpposition;
import Sport.SportProprieties.Basketball;

public class Main {
    public static void main(String[] args) {
        ArrayList<Player> players = new ArrayList<>();
        for(int i=1; i<=110; i++){
            players.add(new Player(i));
        }

        int round = 1;

        while(players.size() > 1){
            if(players.size() == 2){

            }
            else if(round % 2 != 0){
                String nameSport = CatalogSport.foundSportRound(round);
                MatchGenerator matchGenerator = new MatchGenerator(players);
                CollectiveSport[] matchs;
                switch (nameSport) {
                    case "basketball":
                        int nbPlayers = Basketball.getNbOfPlayer();
                        matchs = matchGenerator.makeMatchs(nbPlayers);
                        for(CollectiveSport match : matchs){
                            match = (BasketballOpposition) match;
                        }
                        break;
                }
                

        
                
            }
            round ++;
        }
        
    }
}
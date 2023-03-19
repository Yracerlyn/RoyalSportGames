package Main;

import java.util.ArrayList;
import java.util.Arrays;

import Game_Engine.CatalogSport;
import Game_Engine.MatchGenerator;
import Game_Engine.RoundLimit;
import Participant.Player;
import Random_Generator.RandomClassement;
import Sport.CollectiveSport;
import Sport.DuelSport;
import Sport.IndividualSport;
import Sport.Duel_Content.TableTennisOpposition;
import Sport.Race_Content.BikeRace;
import Sport.Race_Content.RunRace;


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
            System.out.println("Prochain sport : " + nameSport);

            if(players.size() == 2){
                DuelSport duel = new TableTennisOpposition(players);
                duel.setRandomResult();
                winners.addAll(duel.getWinners());
                losers.addAll(duel.getLosers());
            }
            else if(round % 2 != 0){
                MatchGenerator matchGenerator = new MatchGenerator(players);
                ArrayList<CollectiveSport> matchs = matchGenerator.makeMatchs(nameSport);                
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

                race.setClassement(RandomClassement.generateRandomClassement(players));
                winners = race.getWinners();
                //losers = race.getLosers(); pour les statistiques

            }

            players = winners;

            System.out.println("-- Joueurs qualifiés : --");
            int[] idQualifiedPlayer = new int[players.size()];
            int j = 0;
            for(Player player : players){
                idQualifiedPlayer[j++] = player.getId();
            }
            System.out.println(Arrays.toString(idQualifiedPlayer));
            round ++;
        }

        System.out.println(players.get(0).getId() + "a gagné");
        
    }
}
package Competition;

import java.util.Arrays;

import Participant.Player;

public class CompetitionPrinter {
    RoyalSportGamesCompetition competition;

    public CompetitionPrinter(RoyalSportGamesCompetition competition){
        this.competition = competition;
    }

    public void showNumberOfPlayersInGame(){
        System.out.println("Nombre de joueurs restants : " + competition.getNumberOfPlayerInGame());
    }

    public void showCurrentRound(){
        System.out.println("Round actuel : " + competition.getCurrentRound());
    }

    public void showQualifiedPlayers(){
        System.out.println("-- Joueurs qualifiés : --");
        int[] idQualifiedPlayer = new int[this.competition.getNumberOfPlayerInGame()];
        int j = 0;
        for(Player player : this.competition.getPlayers()){
            idQualifiedPlayer[j++] = player.getId();
        }
        System.out.println(Arrays.toString(idQualifiedPlayer));
    }

    public void showWinner(){
        System.out.println();
    }
}

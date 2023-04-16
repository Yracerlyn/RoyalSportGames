package Competition;

import java.util.Arrays;
import java.util.Collection;

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
        System.out.println("Le vainqueur est le joueur numéro " + this.competition.getFinalWinner().getId());
    }

    public void showFinalResultOfUser(int round){
        System.out.println("Vous avez été éliminés au round " + round);
    }

    public void showRoundDetails(RoundResult roundResult){
        System.out.println("Résultats du round " + roundResult.getRound());
        System.out.println("Sport disputé : " + roundResult.getSportName());
        System.out.println("Gagnants du round : " + playersToString(roundResult.getWinners()));
        System.out.println("Perdants du round : " + playersToString(roundResult.getLosers()));
    }

    public String playersToString(Collection<Player> players){
        int[] idQualifiedPlayer = new int[players.size()];
        int j = 0;
        for(Player player : players){
            idQualifiedPlayer[j++] = player.getId();
        }
        return Arrays.toString(idQualifiedPlayer);
    }
}

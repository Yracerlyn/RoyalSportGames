package Competition;

import java.util.ArrayList;
import java.util.Collection;
import Participant.Player;

public class RoyalSportGamesCompetition {
    private Collection<Player> currentPlayers;
    private int currentRound;
    private RoundResult[] roundResults;
    private Player finalWinner;

    //injection de dépendance
    private RoundHandler roundHandler;

    public RoyalSportGamesCompetition(){
        this.roundResults = new RoundResult[7];
        this.currentPlayers = new ArrayList<>();
        this.currentRound = 1;

        this.roundHandler = new RoundHandler(this);

    }

    public void initialisationPlayers(){
        for(int i=1; i<=110; i++){
            this.currentPlayers.add(new Player(i));
        }
    }

    public void setRoundResult(String nameSport, int round, Collection<Player> winners, Collection<Player> losers){
        this.roundResults[this.currentRound - 1] = new RoundResult(nameSport, this.currentRound);
        this.roundResults[round - 1].setWinners(winners);
        this.roundResults[round - 1].setLosers(losers);
    }

    public static void main(String[] args) {
        RoyalSportGamesCompetition compet = new RoyalSportGamesCompetition();
        compet.initialisationPlayers();

        while(compet.currentPlayers.size() > 1){
            compet.roundHandler.startRound();
            compet.roundHandler.goToNextRound();
        }

        compet.setFinalWinner();
  
        System.out.println("Joueur " + compet.getFinalWinner().getId() + " a gagné");

        }           

    public int getNumberOfPlayerInGame(){
        return this.currentPlayers.size();
    }

    public Collection<Player> getPlayers() {
        return this.currentPlayers;
    }

    public Collection<Player> getWinnersOfLastRound(){
        return this.roundResults[this.currentRound - 1].getWinners();
    }

    public void setCurrentRound(int currentRound) {
        this.currentRound = currentRound;
    }

    public void setPlayers(Collection<Player> players) {
        this.currentPlayers = players;
    }

    public int getCurrentRound() {
        return this.currentRound;
    }

    public void setFinalWinner() {
        ArrayList<Player> player = (ArrayList<Player>)this.getPlayers();
        Player winner = player.get(0);
        this.finalWinner = winner;
    }

    public Player getFinalWinner() {
        return finalWinner;
    }
    }


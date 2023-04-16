package Competition;

import java.util.ArrayList;
import java.util.Collection;
import Participant.Player;

public class RoyalSportGamesCompetition {
    private Collection<Player> currentPlayers;
    private int currentRound;
    private RoundResult[] roundResults;
    private Player finalWinner;

    public RoyalSportGamesCompetition(){
        this.roundResults = new RoundResult[7];
        this.currentPlayers = new ArrayList<>();
        this.currentRound = 1;
    }

    public void setRoundResult(String nameSport, int round, Collection<Player> winners, Collection<Player> losers){
        this.roundResults[this.currentRound - 1] = new RoundResult(nameSport, this.currentRound);
        this.roundResults[round - 1].setWinners(winners);
        this.roundResults[round - 1].setLosers(losers);
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

    public RoundResult[] getRoundResults() {
        return this.roundResults;
    }

    public RoundResult getRoundResult(int round){
        return this.roundResults[round - 1];
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


package Competition_Handler;

import Competition.RoundHandler;
import Competition.RoyalSportGamesCompetition;
import Participant.Player;

import java.util.Collection;
import java.util.ArrayList;

public class Launcher {
    private RoyalSportGamesCompetition competition;
    private RoundHandler roundHandler;
    private int playerNumber = 0;
    private boolean doTheUserPlay;

    public void createCompetition(){
        competition = new RoyalSportGamesCompetition();
    }

    public void initialiseRandomPlayers(){
        Collection<Player> players = new ArrayList<>();
        for(int i=1; i<=110; i++){
            players.add(new Player(i));
        }
        this.competition.setPlayers(players);
    }

    public void playRound(){
        roundHandler.startRound();
        roundHandler.goToNextRound();
    }

    public void createRoundHandler(){
        this.roundHandler = new RoundHandler(this.competition);
    }

    public RoyalSportGamesCompetition getCompetition() {
        return competition;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    public void setWinner(){
        this.competition.setFinalWinner();
    }

    public boolean userHasWon(){
        int winner = this.competition.getFinalWinner().getId();
        return winner == this.playerNumber;
    }
}

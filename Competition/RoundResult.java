package Competition;

import java.util.ArrayList;
import java.util.Collection;

import Participant.Player;

public class RoundResult {
    private Collection<Player> winners;
    private Collection<Player> losers;
    private String nameSport;
    private int round;

    public RoundResult(String sportName, int round){
        this.winners = new ArrayList<>();
        this.losers = new ArrayList<>();
        this.nameSport = sportName;
        this.round = round;
    }

    public Collection<Player> getLosers() {
        return losers;
    }

    public String getSportName() {
        return nameSport;
    }

    public Collection<Player> getWinners() {
        return winners;
    }

    public void setLosers(Collection<Player> losers) {
        this.losers = losers;
    }

    public void setSportName(String nameSport) {
        this.nameSport = nameSport;
    }

    public void setWinners(Collection<Player> winners) {
        this.winners = winners;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }
}

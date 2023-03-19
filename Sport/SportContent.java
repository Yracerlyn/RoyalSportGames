package Sport;


import java.util.ArrayList;
import java.util.Collection;

import Participant.Player;

public abstract class SportContent {
    private String name;
    private Collection<Player> players;
    private boolean matchStatus;

    public SportContent(ArrayList<Player> players){
        this.players = players;
        this.matchStatus = false;
    }

    public String getName(){
        return this.name;
    }

    public Collection<Player> getPlayers(){
        return this.players;
    }
    
    public int getNbOfPlayer(){
        return this.players.size();
    }   

    public boolean isFinished(){
        return this.matchStatus;
    }

    public void endOfTheMatch(){
        this.matchStatus = true;
    }

    public abstract Collection<Player> getWinners();

    public abstract Collection<Player> getLosers();
}
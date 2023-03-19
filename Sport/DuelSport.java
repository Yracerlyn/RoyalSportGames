package Sport;

import java.util.ArrayList;
import java.util.Collection;

import Participant.Player;

public abstract class DuelSport extends SportContent{
    
    private ArrayList<Player> finalPlayers;
    private int[] result = new int[2];
    
    public DuelSport(ArrayList<Player> players) {
        super(players);
        this.finalPlayers = players;
        
    }

    public abstract void setRandomResult();

    public void setResult(int fisrtNumber, int secondNumber){
        this.result[0]= fisrtNumber;
        this.result[1] = secondNumber;
    }

    @Override
    public Collection<Player> getWinners() {
        Collection<Player> winner = new ArrayList<>();
        if(result[0] > result[1]){
            winner.add(finalPlayers.get(0));
        }
        else{
            winner.add(finalPlayers.get(1));
        }
        return winner;
    }

    @Override
    public Collection<Player> getLosers() {
        Collection<Player> loser = new ArrayList<>();
        if(result[0] > result[1]){
            loser.add(finalPlayers.get(1));    
        }
        else{
            loser.add(finalPlayers.get(0));
        }
        return loser;
    }

    public int[] getResult() {
        return result;
    }

    }

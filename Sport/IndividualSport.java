package Sport;

import java.util.ArrayList;

import Participant.Player;

public abstract class IndividualSport extends SportContent{
    
    private ArrayList<Player> classement;
    private int nbPlayerLimit;
    
    protected IndividualSport(ArrayList<Player> players, int nbPlayerLimit) {
        super(players);
        this.nbPlayerLimit = nbPlayerLimit;
        this.classement = new ArrayList<>();
    }

    @Override
    public ArrayList<Player> getWinners() {
        ArrayList<Player> winners = new ArrayList<>(); 
        for(int i=0; i<this.nbPlayerLimit; i++){
            winners.add(classement.get(i));
        }
        return winners;
    }

    @Override
    public ArrayList<Player> getLosers() {
        ArrayList<Player> losers = new ArrayList<>(); 
        for(int i=this.nbPlayerLimit; i<classement.size(); i++){
            losers.add(classement.get(i));
        }
        return losers;
    }


    public ArrayList<Player> getClassement() {
        return classement;
    }

    public void setClassement(ArrayList<Player> classement){
        this.classement = classement;
    }
}

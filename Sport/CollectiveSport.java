package Sport;

import java.util.Collection;
import java.util.HashMap;

import Participant.Player;
import Participant.Team;
import Participant.TeamCreator;

public abstract class CollectiveSport extends SportContent implements Score{
    protected Team firstTeam;
    private Team secondTeam;
    public Team[] allTeams = {firstTeam, secondTeam};
    public HashMap<Team, Integer> result = new HashMap<>();

    public CollectiveSport(){
        this.allTeams = TeamCreator.makeTwoTeams(this.getPlayers());
        result.put(firstTeam, null);
        result.put(secondTeam, null);
        
    }

    public void setResult(int resultFirstTeam, int resultSecondTeam) {
        if(this.isFinished() == false){ //exception
            this.result.put(firstTeam, resultFirstTeam);
            this.result.put(secondTeam, resultSecondTeam);
            endOfTheMatch();
        }
    }

    public Collection<Player> getWinners() {
        int randomNumber = (int) (Math.random() * 2 + 1);
        if(randomNumber == 1){
            Collection<Player> winners = firstTeam.getPlayers();
            return winners;
        }
        else{
            Collection<Player> winners = secondTeam.getPlayers();
            return winners;
        }
    }

    public int getNbOfTeamPlayer(){
        return firstTeam.getPlayers().size();
    }
    
    public void setAllTeams(Team[] allTeams) {
        this.allTeams = allTeams;
    }
}

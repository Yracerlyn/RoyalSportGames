package Sport;

import java.util.Collection;
import Participant.Player;
import Participant.Team;
import Participant.TeamCreator;
import Random_Generator.RandomResults;

public abstract class CollectiveSport extends SportContent{
    protected Team firstTeam;
    protected Team secondTeam;
    private Team[] allTeams = {firstTeam, secondTeam};
    private int[] result = new int[2];

    protected CollectiveSport(Collection<Player> players){
        super(players);
        this.allTeams = TeamCreator.makeTwoTeams(this.getPlayers());
        
    }

    public void setResult(int resultFirstTeam, int resultSecondTeam) {
        this.result[0] = resultFirstTeam;
        this.result[1] = resultSecondTeam;

    }

    @Override
    public Collection<Player> getLosers() {
        if(this.result[0] < this.result[1]){
            return allTeams[0].getPlayers();
        }
        else{
            return allTeams[1].getPlayers();
        }
    }

    @Override
    public Collection<Player> getWinners() {
        if(this.result[0] < this.result[1]){
            return allTeams[1].getPlayers();
        }

        // cas où il y a égalité
        else if(this.result[0] == this.result[1]){
            int numTeamWinner = RandomResults.getRandomWinner();
            this.updateResult(numTeamWinner);
            return this.allTeams[numTeamWinner].getPlayers();
        }
        else{
            return allTeams[0].getPlayers();
        }
        
    }

    public void updateResult(int numTeam){
        int formerResult = this.result[numTeam];
        this.result[numTeam] = formerResult + 1;
    }

    public abstract void setRandomResult();

    public int getNbOfTeamPlayer(){
        return firstTeam.getPlayers().size();
    }
    
    public void setAllTeams(Team[] allTeams) {
        this.allTeams = allTeams;
    }

    public Team[] getAllTeams() {
        return allTeams;
    }

    public int[] getResult() {
        return result;
    }
}

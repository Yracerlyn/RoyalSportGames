package Sport;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import Participant.Player;
import Participant.Team;
import Participant.TeamCreator;
import Random_Generator.RandomResults;

public abstract class CollectiveSport extends SportContent implements Score{
    protected Team firstTeam;
    private Team secondTeam;
    public Team[] allTeams = {firstTeam, secondTeam};
    public HashMap<Team, Integer> result = new HashMap<>();

    public CollectiveSport(ArrayList<Player> players){
        super(players);
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

    @Override
    public Collection<Player> getLosers() {
        if(result.get(allTeams[0]) < result.get(allTeams[1])){
            return allTeams[0].getPlayers();
        }
        else{
            return allTeams[1].getPlayers();
        }
    }

    @Override
    public Collection<Player> getWinners() {
        if(result.get(allTeams[0]) < result.get(allTeams[1])){
            return allTeams[1].getPlayers();
        }

        // cas où il y a égalité
        else if(result.get(allTeams[0]) == result.get(allTeams[1])){
            Team winnerTeam = allTeams[RandomResults.getRandomWinner()];
            this.updateResult(winnerTeam);
            return winnerTeam.getPlayers();
        }
        else{
            return allTeams[0].getPlayers();
        }
        
    }

    public void updateResult(Team team){
        int formerResult = this.result.get(team);
        this.result.put(team, formerResult + 1);
    }

    public abstract void setRandomResult();

    public int getNbOfTeamPlayer(){
        return firstTeam.getPlayers().size();
    }
    
    public void setAllTeams(Team[] allTeams) {
        this.allTeams = allTeams;
    }
}

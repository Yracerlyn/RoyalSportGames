package Participant;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.List;

public class TeamCreator {
    public static Team[] makeTwoTeams(Collection<Player> players){
        ArrayList<Player> players2 = new ArrayList<>(players);

        
        Team[] allTeams = new Team[2];
        Collection<Player> firstTeam = new ArrayList<>();
        Collection<Player> secondTeam = new ArrayList<>();

        for(int i=0; i<players2.size()/2; i++){
            //exception
            firstTeam.add(players2.get(i));

        }

        for(int i=players2.size()/2; i<players2.size();i++){
            secondTeam.add(players2.get(i));
        }

        allTeams[0] = new Team((Collection<Player>)firstTeam);
        allTeams[1] = new Team((Collection<Player>)secondTeam);
        
        return allTeams;
    }


}

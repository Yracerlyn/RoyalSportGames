package Main;

import java.util.ArrayList;
import java.util.Collection;

import Participant.Player;
import Participant.Team;
import Participant.TeamCreator;

public class Main {
    public static void main(String[] args) {
        Collection<Player> players = new ArrayList<>();
        for(int i=1; i<=32; i++){
            players.add(new Player(i));
        }

        Team[] allTeams= new Team[2];
        
        allTeams = TeamCreator.makeTwoTeams(players);

        System.out.println("Team 1");
        for(Player p : allTeams[0].getPlayers()){
            System.out.println("Player numéro " + p.getId());
        }

        System.out.println("Team 2");
        for(Player p : allTeams[1].getPlayers()){
            System.out.println("Player numéro " + p.getId());
        }
    }
}

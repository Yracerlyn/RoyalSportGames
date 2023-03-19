package Random_Generator;

import java.util.ArrayList;
import java.util.Random;

import Participant.Player;

public class RandomPlayers {
    
    public static ArrayList<Player> generateRandomPlayers(){
        ArrayList<Player> players = new ArrayList<>();
        for(int i=1; i<=110; i++){
            players.add(new Player(i));
        }
        return players;
    }
}

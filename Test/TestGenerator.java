package Test;

import java.util.ArrayList;

import Participant.Player;
import Random_Generator.RandomClassement;

public class TestGenerator {
    public static void main(String[] args) {
        ArrayList<Player> players = new ArrayList<>();
        for(int i=1; i<=110; i++){
            players.add(new Player(i));
        }
        
        ArrayList<Player> classement = RandomClassement.generateRandomClassement(players);
        for(int i=1; i<= classement.size(); i++){
            System.out.println("Numéro " + i + " : " + classement.get(i-1).getId());
        }
    }
}

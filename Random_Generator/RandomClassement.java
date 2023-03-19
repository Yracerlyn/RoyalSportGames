package Random_Generator;

import java.util.ArrayList;
import java.util.Random;
import Participant.Player;

public class RandomClassement {
    private static Random random = new Random();

    private RandomClassement(){}
   
    public static ArrayList<Player> generateRandomClassement(ArrayList<Player> players){
        ArrayList<Player> randomClassement = new ArrayList<>();

        while(!players.isEmpty()){
            int index = random.nextInt(players.size());
            randomClassement.add(players.get(index));
            players.remove(index);

        }
        return randomClassement;
    } 
}

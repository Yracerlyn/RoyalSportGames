package Sport.CollectiveContent;

import java.util.ArrayList;
import java.util.Collection;

import Participant.Player;
import Random_Generator.RandomResults;
import Sport.CollectiveSport;
import Sport.SportProprieties.Volleyball;

public class VolleyballOpposition extends CollectiveSport implements Volleyball{

    public VolleyballOpposition(ArrayList<Player> players) {
        super(players);
    }

    @Override
    public void setRandomResult(){
        if(RandomResults.getRandomWinner() == 0){
            int randomNumber1 = 3;
            this.result.put(allTeams[0], randomNumber1);
            int randomNumber2 = RandomResults.getSetRandomResult();
            this.result.put(allTeams[1], randomNumber2);
        }
        else{
            int randomNumber1 = 3;
            this.result.put(allTeams[1], randomNumber1);
            int randomNumber2 = RandomResults.getSetRandomResult();
            this.result.put(allTeams[0], randomNumber2);
        }

    }
}

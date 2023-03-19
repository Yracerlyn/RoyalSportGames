package Sport.CollectiveContent;

import java.util.ArrayList;
import java.util.Random;

import Participant.Player;
import Participant.Team;
import Random_Generator.RandomResults;
import Sport.CollectiveSport;
import Sport.SportProprieties.Basketball;

public class BasketballOpposition extends CollectiveSport implements Basketball{

    public BasketballOpposition(ArrayList<Player> players) {
        super(players);
    }

    @Override
    public void setRandomResult(){
        int randomNumber1 = RandomResults.getBaskettballRandomResult();
        this.result.put(allTeams[0], randomNumber1);
        
        int randomNumber2 = RandomResults.getBaskettballRandomResult();
        this.result.put(allTeams[0], randomNumber2);
    }

    
}

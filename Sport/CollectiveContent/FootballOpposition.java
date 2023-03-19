package Sport.CollectiveContent;
import java.util.ArrayList;
import java.util.Collection;

import Participant.Player;
import Random_Generator.RandomResults;
import Sport.CollectiveSport;
import Sport.SportProprieties.Football;

public class FootballOpposition extends CollectiveSport implements Football{

    
    public FootballOpposition(ArrayList<Player> players) {
        super(players);
    }

    @Override
    public void setRandomResult(){
        int randomNumber1 = RandomResults.getFootballRandomResult();
        this.result.put(allTeams[0], randomNumber1);
        
        int randomNumber2 = RandomResults.getFootballRandomResult();
        this.result.put(allTeams[0], randomNumber2);
    }
}

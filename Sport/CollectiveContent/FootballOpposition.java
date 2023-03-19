package Sport.CollectiveContent;

import java.util.Collection;
import Participant.Player;
import Random_Generator.RandomResults;
import Sport.CollectiveSport;
import Sport.SportProprieties.Football;

public class FootballOpposition extends CollectiveSport implements Football{

    
    public FootballOpposition(Collection<Player> players) {
        super(players);
    }

    @Override
    public void setRandomResult(){
        int randomNumber1 = RandomResults.getFootballRandomResult();
        
        int randomNumber2 = RandomResults.getFootballRandomResult();
    
        this.setResult(randomNumber1, randomNumber2);
        
    }
}

package Sport.CollectiveContent;

import java.util.Collection;
import Participant.Player;
import Random_Generator.RandomResults;
import Sport.CollectiveSport;
import Sport.SportProprieties.Basketball;

public class BasketballOpposition extends CollectiveSport implements Basketball{

    public BasketballOpposition(Collection<Player> players) {
        super(players);
    }

    @Override
    public void setRandomResult(){
        int randomNumber1 = RandomResults.getBaskettballRandomResult();
        
        int randomNumber2 = RandomResults.getBaskettballRandomResult();
    
        this.setResult(randomNumber1, randomNumber2);
        
    }

    
}

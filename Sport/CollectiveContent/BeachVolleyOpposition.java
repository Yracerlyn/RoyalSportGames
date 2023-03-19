package Sport.CollectiveContent;

import java.util.Collection;
import Participant.Player;
import Random_Generator.RandomResults;
import Sport.CollectiveSport;
import Sport.SportProprieties.BeachVolley;

public class BeachVolleyOpposition extends CollectiveSport implements BeachVolley{

    public BeachVolleyOpposition(Collection<Player> players) {
        super(players);
    }

    @Override
    public void setRandomResult(){
        if(RandomResults.getRandomWinner() == 0){
            int randomNumber1 = 3;
            this.getResult()[0] = randomNumber1;
            int randomNumber2 = RandomResults.getSetRandomResult();
            this.getResult()[1] = randomNumber2;
        }
        else{
            int randomNumber1 = 3;
            this.getResult()[1] = randomNumber1;

            int randomNumber2 = RandomResults.getSetRandomResult();
            this.getResult()[0] = randomNumber2;

        }

    }

    
}
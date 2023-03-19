package Sport.Duel_Content;

import java.util.ArrayList;

import Participant.Player;
import Random_Generator.RandomResults;
import Sport.DuelSport;

public class TableTennisOpposition extends DuelSport{

    public TableTennisOpposition(ArrayList<Player> players) {
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
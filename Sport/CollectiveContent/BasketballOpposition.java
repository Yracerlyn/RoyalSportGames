package Sport.CollectiveContent;

import java.util.ArrayList;
import Sport.CollectiveSport;

public class BasketballOpposition extends CollectiveSport implements Basketball{

    public BasketballOpposition(){
        super();
    }

    public ArrayList<Integer> getScore(boolean teamWinner){
        if(teamWinner){
            int randomNumber1 = (int) (Math.random() * 150 + 1);
            int randomNumber2 = (int) (Math.random() * 149 + 1);
        }
        else{
            int randomNumber2 = (int) (Math.random() * 150 + 1);
            int randomNumber1 = (int) (Math.random() * 149 + 1);
        }
        ArrayList<Integer> score = new ArrayList<>();
        return score;
    }



    
}

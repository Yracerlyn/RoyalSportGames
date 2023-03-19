package Game_Engine;

import Sport.CollectiveSport;

public class CollectiveTour {
    private CollectiveSport[] matchs; //collectif

    public CollectiveTour(CollectiveSport[] sport){
        this.matchs = sport;
    }
 
    public CollectiveSport[] getMatchs() {
        return matchs;
    }
}

package Game_Engine;

import Sport.IndividualSport;

public class IndividualTour {
    private IndividualSport sport; //individuel 
    

    public IndividualTour(IndividualSport sport){
        this.sport = sport;
    }

    public IndividualSport getSport() {
        return sport;
    }
}
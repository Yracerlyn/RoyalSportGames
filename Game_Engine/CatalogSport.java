package Game_Engine;

import java.util.ArrayList;
import java.util.HashMap;

public class CatalogSport {
    private static HashMap<Integer, ArrayList<String>> catalog;

    static{
        for(int i=1; i<=7; i++){
            catalog.put(i, new ArrayList<>()); 
        }

        catalog.get(1).add("football");
        catalog.get(2).add("bike");
        catalog.get(3).add("basketball");
        catalog.get(3).add("volleyball");
        catalog.get(4).add("swimming");
        catalog.get(4).add("kayak");
        catalog.get(4).add("running");
        catalog.get(5).add("petanque");
        catalog.get(6).add("swimming");
        catalog.get(6).add("kayak");
        catalog.get(6).add("running");
        catalog.get(7).add("tabletennis");
    }

    public static String foundSportRound(int id){
        ArrayList<String> possibleSport = catalog.get(id);
        if(possibleSport.size() != 1){
            int randomNumber = (int) (Math.random() * possibleSport.size());
            return possibleSport.get(randomNumber);
        }
        else{
            return possibleSport.get(0);
        }
    }

}
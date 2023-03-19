package Game_Engine;

import java.util.ArrayList;
import java.util.HashMap;

public class RoundLimit {
    private static HashMap<Integer, Integer> maxNumberPlayerLimit;

    static{
        maxNumberPlayerLimit.put(1,55);
        maxNumberPlayerLimit.put(2,40);
        maxNumberPlayerLimit.put(3,20);
        maxNumberPlayerLimit.put(4,12);
        maxNumberPlayerLimit.put(5,6);
        maxNumberPlayerLimit.put(6,2);
        maxNumberPlayerLimit.put(7,1);

    }

    public static int foundPlayerLimit(int id){
        return maxNumberPlayerLimit.get(id);
    }
}

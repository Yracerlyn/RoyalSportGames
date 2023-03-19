package Random_Generator;

import java.util.Random;

public class RandomResults {
    private static Random random = new Random();

    public static int getRandomWinner(){
        return random.nextInt(0,1);
    } 

    public static int getBaskettballRandomResult(){
        return random.nextInt(60, 100);
    }

    public static int getSetRandomResult(){
        return random.nextInt(0, 2);
    }

    public static int getFootballRandomResult(){
        return random.nextInt(0, 5);
    }

}

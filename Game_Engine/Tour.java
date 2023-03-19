package Game_Engine;

public abstract class Tour {

    private int round;

    public Tour(int round){
        this.round = round;
    }

    public int getRound() {
        return round;
    }
}
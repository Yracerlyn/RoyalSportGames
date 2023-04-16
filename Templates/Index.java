package Templates;

import java.util.Scanner;

import Competition.RoyalSportGamesCompetition;
import Model.KeyRepository;

public class Index {
    private ResponseManager responseManager;
    private KeyRepository keyRepository;
    
    public Index(){
        responseManager = new ResponseManager();
        keyRepository = new KeyRepository();
    }
    
    public void start(){
        Connexion connexion = new Connexion();
        connexion.connexion();
        Home home = new Home();
        home.home();
    }

    public static void main(String[] args) {
        Index index = new Index();
        index.start();
    }
}

package Templates;

import Competition.RoyalSportGamesCompetition;
import Competition_Handler.Launcher;

public class Home {
    private ResponseManager responseManager;
    private Printer printer;

    public Home(){
        responseManager = new ResponseManager();
        printer = new Printer();
    }

    public void home(){
        String response = responseManager.askForLauching();
        if(response.equals("n")){
            printer.thanksForPlaying();
            System.exit(1);
        }
        else{
            Launcher launcher = new Launcher();
            launcher.createCompetition();
            Game game = new Game(launcher);
            game.start();
        }
    }

}

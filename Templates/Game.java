package Templates;

import Competition.CompetitionPrinter;
import Competition_Handler.Historic;
import Competition_Handler.Launcher;

public class Game {
    private ResponseManager responseManager;
    private Launcher launcher;
    private Printer printer;
    private CompetitionPrinter competitionPrinter;

    public Game(Launcher launcher){
        this.launcher = launcher;
        this.responseManager = new ResponseManager();
        this.printer = new Printer();
    }

    public void start(){
        String response = this.responseManager.askIfTheUserWantsToPlay();
        if(response.equals("y")){
            int intResponse = this.responseManager.askNumberTheUserWantsToBe();
            launcher.setPlayerNumber(intResponse);
        }
        launcher.initialiseRandomPlayers();
        launcher.createRoundHandler();
        this.startRounds();
    }

    public void startRounds(){
        this.competitionPrinter = new CompetitionPrinter(launcher.getCompetition());
        while(launcher.getCompetition().getNumberOfPlayerInGame() > 1){
            competitionPrinter.showCurrentRound();
            launcher.playRound();
            competitionPrinter.showQualifiedPlayers();
        }
        launcher.setWinner();
        this.endGame();
    }

    public void endGame(){
        String response = responseManager.askUserIfHeWantsToSeeHistoric();
        if(response.equals("y")){
            this.historic();
        }
        else{
            printer.thanksForPlaying();
        }
    }

    public void historic(){
        Historic historic = new Historic(this.launcher.getCompetition());
        if(launcher.userHasWon()){
            this.printer.congratulateUser();
        }
        else{
            this.competitionPrinter.showWinner();
            if(launcher.getPlayerNumber() != 0){
                competitionPrinter.showFinalResultOfUser(historic.searchLastRoundOfPlayer(launcher.getPlayerNumber()));
            }
        }
        int intResponse = responseManager.askRoundDetails();
        while(intResponse != 0){
            this.competitionPrinter.showRoundDetails(launcher.getCompetition().getRoundResult(intResponse));
            intResponse = responseManager.askRoundDetails();
        }
        printer.thanksForPartipating();
        System.exit(1);
    }

}



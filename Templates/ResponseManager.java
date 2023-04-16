package Templates;

import java.util.Scanner;

public class ResponseManager {
    private Scanner scan;
    private Printer printer;

    public ResponseManager(){
        scan = new Scanner(System.in);
        printer = new Printer();
    }
    
    public String askKey(){
        printer.askForKeyPrinter();
        return scan.next();
    }

    public String askForLauching(){
        printer.askForLauchingPrinter();
        return scan.next();
    }

    public String askIfTheUserWantsToPlay(){
        printer.askIfTheUserWantsToPlayPrinter();
        return scan.next();
    }

    public int askNumberTheUserWantsToBe(){
        printer.askNumberTheUserWantsToBePrinter();
        int response = scan.nextInt();
        while(response < 1 || response > 110){
            System.out.println(response + " n'est pas un nombre valide.");
            printer.askNumberTheUserWantsToBePrinter();
            response = scan.nextInt();
        }
        return response;
    }

    public String askUserIfHeWantsToSeeHistoric(){
        printer.askUserIfHeWantsToSeeHistoricPrinter();
        return scan.next();
    }

    public int askRoundDetails(){
        printer.askRoundDetailsPrinter();
        return scan.nextInt();
    }
}

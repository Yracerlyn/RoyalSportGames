package Templates;

import Model.KeyRepository;

public class Connexion {
    private ResponseManager responseManager;
    private Printer printer;
    private KeyRepository keyRepository;
    
    public Connexion(){
        responseManager = new ResponseManager();
        keyRepository = new KeyRepository();
        printer = new Printer();
    }

    public void connexion(){
        String reponse = responseManager.askKey();
        while(!keyRepository.matchKey(reponse)){
            printer.keyIsNotMatching();
            reponse = responseManager.askKey();
        }
        printer.keyIsMatching();
    }
}

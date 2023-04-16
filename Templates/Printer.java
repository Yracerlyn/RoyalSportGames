package Templates;

public class Printer {
    public void askForKeyPrinter(){
        System.out.println("Veuillez entrer la clé pour vous connecter.");
    }
    public void keyIsNotMatching(){
        System.out.println("Mauvaise clé, veuillez réessayer.");
    }
    public void keyIsMatching(){
        System.out.println("Clé correcte.");
    }
    public void askForLauchingPrinter(){
        System.out.println("Vous voulez lancer une RoyalSportGame ? [y] or [n]");
    }
    public void thanksForPlaying(){
        System.out.println("Au revoir.");
    }
    public void askIfTheUserWantsToPlayPrinter(){
        System.out.println("Voulez vous faire partie de la compétition ? [y] or [n]");
    }

    public void askNumberTheUserWantsToBePrinter(){
        System.out.println("Choisissez un numéro entre 1 et 110");
    }

    public void askUserIfHeWantsToSeeHistoricPrinter(){
        System.out.println("Souhaitez vous voir l'historique de la partie ? [y] or [n]");
    }

    public void congratulateUser(){
        System.out.println("Bravo pour votre victoire !!! Vous avez passés tous les rounds !");
    }

    public void askRoundDetailsPrinter(){
        System.out.println("Souhaitez vous voir les détails d'un round en particulier ?");
        System.out.println("Si oui, choisissez un round entre 1 et 7. Sinon, entrez 0.");
    }

    public void thanksForPartipating(){
        System.out.println("Merci d'avoir participé !");
    }
}

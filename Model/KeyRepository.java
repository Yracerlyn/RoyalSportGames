package Model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class KeyRepository {
    private final String FILE_NAME = "Model/key.txt";

    public boolean matchKey(String response){
        if(this.getKey().equals(response)){
            return true;
        }
        else{
            return false;
        }
    }

    public String getKey(){
         // Nom du fichier à lire
            // Créer un BufferedReader pour lire le fichier
        try{
            BufferedReader reader = new BufferedReader(new FileReader(this.FILE_NAME));
            String line;
            StringBuilder sb = new StringBuilder();

            // Lire le fichier ligne par ligne
            while ((line = reader.readLine()) != null) {
                sb.append(line); // Ajouter la ligne au StringBuilder
            }

            // Fermer le BufferedReader
            reader.close();
            return sb.toString();
        }catch (IOException e) {
            System.err.println("Erreur lors de la lecture du fichier : " + e.getMessage());
            e.printStackTrace();
            return "";
        }
    }

    public static void main(String[] args) {
        KeyRepository keyRepository = new KeyRepository();
        System.out.println(keyRepository.getKey());
        System.out.println(keyRepository.matchKey("competition"));
    }
}

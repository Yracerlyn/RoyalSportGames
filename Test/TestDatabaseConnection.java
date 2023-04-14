package Test;

import ModelBDD.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestDatabaseConnection {

    public static <DatabaseConnection> void main(String[] args) {
        try {

            Class.forName("com.mysql.jdbc.Driver");
            // Obtenir une instance de la connexion à la base de données
            DatabaseConnection dbConn = DatabaseConnection.getInstance();
            Connection conn = dbConn.getConnection();

            // Préparer la requête SQL pour récupérer les informations de la table "joueur"
            String query = "SELECT * FROM joueur";
            PreparedStatement stmt = conn.prepareStatement(query);


            // Exécuter la requête SQL
            ResultSet rs = stmt.executeQuery();

            // Parcourir les résultats et afficher les informations de chaque joueur
            while (rs.next()) {
                int id = rs.getInt("id");
                String nom = rs.getString("nom");
                String prenom = rs.getString("prenom");
                int age = rs.getInt("age");
                System.out.println("ID : " + id + ", Nom : " + nom + ", Prénom : " + prenom + ", Âge : " + age);
            }

            // Fermer les ressources
            rs.close();
            stmt.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}

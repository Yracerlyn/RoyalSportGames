package Repository;

import DatabaseConnection.DatabaseConnection;
import Participant.Player;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PlayerRepositoryImpl implements PlayerRepository {
    private Connection connection;

    public PlayerRepositoryImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void createPlayer(Player player) {
        try{
            // Préparer la requête d'insertion dans la base de données
            String sql = "INSERT INTO users (name, username, age) VALUES (nom, prenom, age)";
            PreparedStatement statement = connection.prepareStatement(sql);

            // Définir les paramètres de la requête avec les valeurs de l'utilisateur
            statement.setString(1, player.getName());
            statement.setString(2, player.getUsername());
            statement.setInt(3, player.getAge());

            // Exécuter la requête d'insertion
            statement.executeUpdate();

            // Fermer la ressource statement
            statement.close();

            System.out.println("Nouvel utilisateur créé : " + player.getUsername());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Player getUserByUsername(String username) {
        // Code pour récupérer un utilisateur par son nom d'utilisateur
        // depuis la base de données en utilisant la connexion à la base de données
        // ...
        return player;
    }


}

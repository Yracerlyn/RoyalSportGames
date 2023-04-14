package Repository;

import Participant.Player;

public interface PlayerRepository {
    void createPlayer(Player player);
    Player getUserByUsername(String username);
}

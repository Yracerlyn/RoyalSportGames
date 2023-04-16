package Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Participant.Player;

public class PlayerTest {

    @Test
    public void testGetId() {
        Player player = new Player(1);
        int expectedId = 1;
        int actualId = player.getId();
        assertEquals(expectedId, actualId);
    }

}
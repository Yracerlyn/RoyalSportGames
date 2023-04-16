package Test;

import Game_Engine.RoundLimit;
import org.junit.Assert;
import org.junit.Test;

public class RoundLimitTest {

    @Test
    public void testFoundPlayerLimit() {
        // Test case 1: id = 1
        int expectedLimit1 = 55;
        int actualLimit1 = RoundLimit.foundPlayerLimit(1);
        Assert.assertEquals(expectedLimit1, actualLimit1);

        // Test case 2: id = 3
        int expectedLimit2 = 20;
        int actualLimit2 = RoundLimit.foundPlayerLimit(3);
        Assert.assertEquals(expectedLimit2, actualLimit2);

        // Test case 3: id = 7
        int expectedLimit3 = 1;
        int actualLimit3 = RoundLimit.foundPlayerLimit(7);
        Assert.assertEquals(expectedLimit3, actualLimit3);
    }
}
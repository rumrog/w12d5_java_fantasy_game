package spells;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpellsTest {

    LightingStrike lightingStrike;

    @Before
    public void before(){
        lightingStrike = new LightingStrike(20);
    }

    @Test
    public void lightingStrikeCanDealDamage(){
        assertEquals(20, lightingStrike.getDamageToDeal());
    }
}

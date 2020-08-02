package armory;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArmoryTest {

    Sword sword;

    @Before
    public void before(){
        sword = new Sword(10);
    }

    @Test
    public void swordCanDealDamage(){
        assertEquals(10, sword.getDamageToDeal());
    }

}

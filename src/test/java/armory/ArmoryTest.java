package armory;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArmoryTest {

    Sword sword;
    PlateArmour armour;

    @Before
    public void before(){
        sword = new Sword(10);
        armour = new PlateArmour(5);

    }

    @Test
    public void swordCanDealDamage(){
        assertEquals(10, sword.getDamageToDeal());
    }

    @Test
    public void armourHasProtection(){
        assertEquals(5, armour.getProtection(),0.1);
    }

}

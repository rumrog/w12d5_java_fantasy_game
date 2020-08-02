package players;

import armory.PlateArmour;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;
    PlateArmour plateArmour;

    @Before
    public void before(){
        plateArmour = new PlateArmour(5);
        knight = new Knight("The Black Knight", 40, 100, plateArmour);
    }

    @Test
    public void canProtect(){
        knight.takeDamage(10);
        assertEquals(35, knight.getHealthPoints());
    }
}

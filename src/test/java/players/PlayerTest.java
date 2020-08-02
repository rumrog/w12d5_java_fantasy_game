package players;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player barbarian;
    Player wizard;

    @Before
    public void before(){
        barbarian = new Barbarian("Conan", 500, 0);
        wizard = new Wizard("Gandalf", 250, 10);
    }

    @Test
    public void hasName(){
        assertEquals("Conan", barbarian.getName());
        assertEquals("Gandalf", wizard.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(500, barbarian.getHealthPoints());
        assertEquals(250, wizard.getHealthPoints());
    }

    @Test
    public void hasTreasureChest(){
        assertEquals(0, barbarian.getTreasureChest());
        assertEquals(10, wizard.getTreasureChest());
    }
}

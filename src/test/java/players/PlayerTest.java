package players;

import org.junit.Before;
import org.junit.Test;
import spells.LightingStrike;
import spells.Spells;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Barbarian barbarian;
    Wizard wizard;

    Spells lightingStrike;

    @Before
    public void before(){
        barbarian = new Barbarian("Conan", 500, 0);
        wizard = new Wizard("Gandalf", 250, 10);

        lightingStrike = new LightingStrike(20);
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

    @Test
    public void hasSpellsInSpells(){
        wizard.addSpellToSpells(lightingStrike);
        assertEquals(1, wizard.countSpells());
    }
}

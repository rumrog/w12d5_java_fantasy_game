package players;

import armory.Armory;
import armory.Sword;
import healingTools.Potion;
import org.junit.Before;
import org.junit.Test;
import spells.LightingStrike;
import spells.Spells;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Barbarian barbarian;
    Wizard wizard;
    Cleric cleric;

    Armory sword;
    Spells lightingStrike;
    Potion potion;

    @Before
    public void before(){
        // Players
        barbarian = new Barbarian("Conan", 500, 0);
        wizard = new Wizard("Gandalf", 250, 10);
        cleric = new Cleric("Elrond", 400, 50);


        // Armory & Spells & Healing Tools
        sword = new Sword(10);
        lightingStrike = new LightingStrike(20);
        potion = new Potion(20);
    }

    @Test
    public void hasName(){
        assertEquals("Conan", barbarian.getName());
        assertEquals("Gandalf", wizard.getName());
        assertEquals("Elrond", cleric.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(500, barbarian.getHealthPoints());
        assertEquals(250, wizard.getHealthPoints());
        assertEquals(400, cleric.getHealthPoints());
    }

    @Test
    public void hasTreasureChest(){
        assertEquals(0, barbarian.getTreasureChest());
        assertEquals(10, wizard.getTreasureChest());
        assertEquals(50, cleric.getTreasureChest());
    }

    @Test
    public void hasSpellsInSpells(){
        wizard.addSpellToSpells(lightingStrike);
        assertEquals(1, wizard.countSpells());
//        System.out.println(wizard.spells);
    }

    @Test
    public void hasItemsInArmory(){
        barbarian.addItemToArmory(sword);
        assertEquals(1, barbarian.countArmory());
    }

    @Test
    public void hasToolsInHealingTools(){
        cleric.addToolToHealingTools(potion);
        assertEquals(1, cleric.countTools());
    }


}

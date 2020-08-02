package players;

import armory.Armory;
import armory.PlateArmour;
import armory.Sword;
import enemies.Orc;
import healingTools.Potion;
import org.junit.Before;
import org.junit.Test;
import spells.LightingStrike;
import spells.Spells;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Barbarian barbarian;
    Knight knight;
    Wizard wizard;
    Cleric cleric;

    Orc orc;

    Armory sword;
    Spells lightingStrike;
    Potion potion;
    PlateArmour plateArmour;

    @Before
    public void before(){
        // Players
        barbarian = new Barbarian("Conan", 50, 0);
        knight = new Knight("The Black Knight", 40, 100, plateArmour);
        wizard = new Wizard("Gandalf", 25, 10);
        cleric = new Cleric("Elrond", 40, 50);


        // Enemies
        orc = new Orc("Grishnákh", 20);

        // Armory & Spells & Healing Tools
        sword = new Sword(10);
        lightingStrike = new LightingStrike(5);
        potion = new Potion(20);
        plateArmour = new PlateArmour(5);
    }

    @Test
    public void hasName(){
        assertEquals("Conan", barbarian.getName());
        assertEquals("Gandalf", wizard.getName());
        assertEquals("Elrond", cleric.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(50, barbarian.getHealthPoints());
        assertEquals(25, wizard.getHealthPoints());
        assertEquals(40, cleric.getHealthPoints());
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

    @Test
    public void canAttack(){
        barbarian.attack(sword, orc);
        wizard.attack(lightingStrike, orc);
        assertEquals(5, orc.getHealthPoints());
    }

    @Test
    public void canHeal(){
        cleric.heal(potion, barbarian);
        assertEquals(70, barbarian.getHealthPoints());
    }

    @Test
    public void canProtect(){
        knight.takeDamage(10);
        assertEquals(35, knight.getHealthPoints());
    }

}

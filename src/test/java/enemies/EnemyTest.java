package enemies;

import armory.Sword;
import org.junit.Before;
import org.junit.Test;
import players.Barbarian;
import players.Player;

import static org.junit.Assert.assertEquals;

public class EnemyTest {

    Orc orc;
    Barbarian barbarian;

    Sword sword;

    @Before
    public void before(){
        orc = new Orc("Grishnákh", 20);
        barbarian = new Barbarian("Conan", 50, 0);

        sword = new Sword(10);
    }

    @Test
    public void hasName(){
        assertEquals("Grishnákh", orc.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(20, orc.getHealthPoints());
    }

    @Test
    public void canAddWeapon(){
        orc.addWeapon(sword);
        assertEquals(1, orc.countWeapons());
    }

    @Test
    public void canTakeDamage(){
        orc.takeDamage(10);
        assertEquals(10, orc.getHealthPoints());
    }
}

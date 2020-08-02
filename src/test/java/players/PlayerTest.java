package players;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;

    @Before
    public void before(){
        player = new Barbarian("Conan", 500, 0);
    }

    @Test
    public void hasName(){
        assertEquals("Conan", player.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(500, player.getHealthPoints());
    }

    @Test
    public void hasTreasureChest(){
        assertEquals(0, player.getTreasureChest());
    }
}

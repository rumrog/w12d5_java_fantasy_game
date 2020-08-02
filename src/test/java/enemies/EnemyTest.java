package enemies;

import armory.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyTest {

    Orc orc;

    @Before
    public void before(){
        orc = new Orc("Grishnákh", 200);
    }

    @Test
    public void hasName(){
        assertEquals("Grishnákh", orc.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(200, orc.getHealthPoints());
    }
}

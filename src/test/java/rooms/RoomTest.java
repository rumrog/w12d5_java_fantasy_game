package rooms;

import enemies.Enemy;
import enemies.Orc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    EnemyRoom enemyRoom;
    TreasureRoom treasureRoom;
    Enemy orc;

    @Before
    public void before(){
        orc = new Orc("Grishnákh", 20);
        enemyRoom = new EnemyRoom();
        treasureRoom = new TreasureRoom(200);

    }

    @Test
    public void canAddEnemyToRoom(){
        enemyRoom.addEnemyToRoom(orc);
        assertEquals(1, enemyRoom.countEnemies());
    }

    @Test
    public void hasTreasure(){
        assertEquals(200, treasureRoom.allowToCollectTreasure());
    }

}

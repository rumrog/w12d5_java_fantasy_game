package rooms;

import enemies.Enemy;

import java.util.ArrayList;

public class EnemyRoom extends Room {

        private ArrayList<Enemy> enemies;
        private Exit exit;


    public EnemyRoom(Exit exit){
            this.enemies = new ArrayList<Enemy>();
            this.exit = exit;
        }

        public void addEnemyToRoom(Enemy enemy){
            this.enemies.add(enemy);
        }

        public int countEnemies(){
            return this.enemies.size();
        }

        public Exit getExit(){
        return this.exit;
        }
}

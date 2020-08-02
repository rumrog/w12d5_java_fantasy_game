package players;

import armory.Armory;
import enemies.Enemy;

import java.util.ArrayList;

public abstract class MeleeCharacter extends Player {

    protected ArrayList<Armory> armory;

    public MeleeCharacter(String name, int healthPoints, int treasureChest){
        super(name, healthPoints, treasureChest);
        this.armory = new ArrayList<Armory>();
    }

    public ArrayList<Armory> getArmory(){
        return this.armory;
    }

    public void addItemToArmory(Armory item){
        this.armory.add(item);
    }

    public int countArmory(){
        return this.armory.size();
    }

}


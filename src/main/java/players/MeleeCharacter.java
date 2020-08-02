package players;

import armory.Armory;

import java.util.ArrayList;

public abstract class MeleeCharacter extends Player {

    protected ArrayList<Armory> armory;

    public MeleeCharacter(String name, int healthPoints, int treasureChest){
        super(name, healthPoints, treasureChest);
        this.armory = new ArrayList<Armory>();
    }

    public void addItemToArmory(Armory item){
        this.armory.add(item);
    }

    public int countArmory(){
        return this.armory.size();
    }
}


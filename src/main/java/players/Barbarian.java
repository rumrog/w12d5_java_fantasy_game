package players;

import armory.Armory;

import java.util.ArrayList;

public class Barbarian extends MeleeCharacter {

    protected ArrayList<Armory> armory;

    public Barbarian(String name, int healthPoints, int treasureChest){
        super(name, healthPoints, treasureChest);
        armory = new ArrayList<Armory>();
    }

}

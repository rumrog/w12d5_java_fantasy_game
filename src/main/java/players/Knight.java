package players;

import armory.Armory;
import armory.PlateArmour;

import java.util.ArrayList;

public class Knight extends MeleeCharacter {

    PlateArmour armour;

    protected ArrayList<Armory> armory;

    public Knight(String name, int healthPoints, int treasureChest, PlateArmour plateArmour){
        super(name, healthPoints, treasureChest);
        this.armory = new ArrayList<Armory>();
        this.armour = plateArmour;
    }

    @Override
    public void takeDamage(int damageValue) {
        int armouredHealth = this.healthPoints + armour.getProtection();
        this.healthPoints = armouredHealth - damageValue;
    }
}

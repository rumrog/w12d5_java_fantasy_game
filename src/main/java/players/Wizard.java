package players;

import spells.Spells;

import java.util.ArrayList;

public class Wizard extends MagicCharacter {

    public Wizard(String name, int healthPoints, int treasureChest){
        super(name, healthPoints, treasureChest);
        this.spells = new ArrayList<Spells>();
    }

    public ArrayList<Spells> getSpells(){
        return this.spells;
    }
}

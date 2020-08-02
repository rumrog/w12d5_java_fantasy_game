package players;

import enemies.Enemy;
import spells.Spells;

import java.util.ArrayList;

public abstract class MagicCharacter extends Player {

    protected ArrayList<Spells> spells;

    public MagicCharacter(String name, int healthPoints, int treasureChest) {
        super(name, healthPoints, treasureChest);
        spells = new ArrayList<Spells>();
    }

    public ArrayList<Spells> getSpells(){
        return this.spells;
    }

    public void addSpellToSpells(Spells spell){
        this.spells.add(spell);
    }

    public int countSpells(){
        return this.spells.size();
    }

}

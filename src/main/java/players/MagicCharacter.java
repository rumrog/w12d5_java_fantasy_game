package players;

import armory.Armory;
import spells.Spells;

import java.util.ArrayList;

public abstract class MagicCharacter extends Player {

    protected ArrayList<Spells> spells;

    public MagicCharacter(String name, int healthPoints, int treasureChest) {
        super(name, healthPoints, treasureChest);
        spells = new ArrayList<Spells>();
    }


}

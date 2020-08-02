package players;

import healingTools.HealingTools;

import java.util.ArrayList;

public class Cleric extends Player {

    protected ArrayList<HealingTools> healingTools;

    public Cleric(String name, int healthPoints, int treasureChest){
        super(name, healthPoints, treasureChest);
        this.healingTools = new ArrayList<HealingTools>();
    }

    public ArrayList<HealingTools> getHealingTools(){
        return this.healingTools;
    }


}

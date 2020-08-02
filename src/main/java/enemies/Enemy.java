package enemies;

import armory.Armory;

import java.util.ArrayList;

public abstract class Enemy {

    protected String name;
    protected int healthPoints;
    protected ArrayList<Armory> weapons;

    public  Enemy(String name, int healthPoints){
        this.name = name;
        this.healthPoints = healthPoints;
        this.weapons = new ArrayList<Armory>();
    }

    public String getName(){
        return this.name;
    }

    public int getHealthPoints() {
        return this.healthPoints;
    }


}

package players;

public abstract class Player {

    protected String name;
    protected int healthPoints;
    protected int treasureChest;

    public Player(String name, int healthPoints, int treasureChest){
        this.name = name;
        this.healthPoints = healthPoints;
        this.treasureChest = treasureChest;
    }

    public String getName(){
        return this.name;
    }

    public int getHealthPoints() {
        return this.healthPoints;
    }

    public int getTreasureChest(){
        return this.treasureChest;
    }

}

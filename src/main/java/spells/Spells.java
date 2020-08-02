package spells;

public abstract class Spells {

    private int damageToDeal;

    public Spells(int damageToDeal){
        this.damageToDeal = damageToDeal;
    }

    public int getDamageToDeal(){
        return this.damageToDeal;
    }
}

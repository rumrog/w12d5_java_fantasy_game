package spells;

public class LightingStrike extends Spells {

    public LightingStrike(int damageToDeal){
        super(damageToDeal);
    }

    public String canAttack(String data){
        return "The lighting strike has dealt " + data + " damage";
    }
}

package healingTools;

public class Potion extends HealingTools {

    public Potion(int healthToHeal){
        super(healthToHeal);
    }

    public String canHeal(String data){
        return "The potion has healed " + data + " of health!";
    }

}

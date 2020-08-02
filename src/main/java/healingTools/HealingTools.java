package healingTools;

public abstract class HealingTools {

    private int healthToHeal;

    public HealingTools(int healthToHeal){
        this.healthToHeal = healthToHeal;
    }

    public int getHealthToHeal(){
        return this.healthToHeal;
    }
}

package actions;

import armory.Armory;
import enemies.Enemy;
import spells.Spells;

public interface IAttack {

    void attack(Armory item, Enemy enemy);
    void attack(Spells spell, Enemy enemy);
}

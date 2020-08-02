
import armory.PlateArmour;
import armory.Sword;
import enemies.Orc;
import healingTools.Potion;
import players.Barbarian;
import players.Cleric;
import players.Knight;
import players.Wizard;
import spells.LightingStrike;

import java.util.Scanner;

import static javax.xml.bind.DatatypeConverter.parseString;

public class Runner {

    public static void main(String[] args) {

        Scanner name = new Scanner(System.in);

        // Armory & Spells & Healing Tools
        Sword sword = new Sword(10);
        LightingStrike lightingStrike = new LightingStrike(5);
        Potion potion = new Potion(20);
        PlateArmour armour = new PlateArmour(5);

        // Players
        Barbarian barbarian = new Barbarian("Conan", 50, 0);
        Knight knight = new Knight("The Black Knight", 40, 100, armour);
        Wizard wizard = new Wizard("Gandalf", 25, 10);
        Cleric cleric = new Cleric("Elrond", 40, 50);


        // Enemies
        Orc orc = new Orc("Grishnákh", 20);


        System.out.println("Hello barbarian, what's your name?\n");
        System.out.println(

                "#################\n" +
                "#[/][0][/][0][/]#\n" +
                "#...............#\n" +
                "#.......@.......#\n" +
                "#.....|[_]|.....#\n" +
                "#......| |......#\n" +
                "#...............#\n" +
                "######.....######\n");

        String inputPlayersName = name.next();
        String playersName = parseString(inputPlayersName);

        System.out.println("It is dangerous outside, " + playersName + ". Take this.\n");
        System.out.println(

                "#################\n" +
                "#[/][0][ ][0][/]#\n" +
                "#........./.....#\n" +
                "#.......@.|.....#\n" +
                "#.....|[_]......#\n" +
                "#......| |......#\n" +
                "#...............#\n" +
                "######.....######\n");

        System.out.println("[You have been given a rusty sword.]");

        Scanner item = new Scanner(System.in);
        String inputPlayersItem = item.next();
        String playersItem = parseString(inputPlayersItem);

    }
}

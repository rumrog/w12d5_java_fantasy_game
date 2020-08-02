
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
        Knight knight = new Knight("The Black Knight", 40, 100, armour);
        Cleric cleric = new Cleric("The Blue Cleric", 30, 50);

        // Enemies
        Orc orc = new Orc("Grishnákh", 20);

        System.out.println(">>> In a cold and dark stone room, a voice whispers in the shadows:\n");
        System.out.println("Knight, what's your name?\n");
        System.out.println(

                "#################\n" +
                "#...[/]...[o]...#\n" +
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
                "#...[ ]...[o]...#\n" +
                "#...../.........#\n" +
                "#.....|.@.......#\n" +
                "#......[_]|.....#\n" +
                "#......| |......#\n" +
                "#...............#\n" +
                "######.....######\n");

        System.out.println(">>> You have been given a rusty sword.\n");
        System.out.println("Now, get rid of him and bring me something shiny!\n");
        System.out.println(">>> You exit the room.\n");


//        Scanner item = new Scanner(System.in);
//        String inputPlayersItem = item.next();
//        String playersItem = parseString(inputPlayersItem);

        System.out.println(

                "#################\n" +
                "#...[ ]...[o]...#\n" +
                "#...............#\n" +
                "#.......@.......#\n" +
                "#.....|[_]|.....#\n" +
                "#...../| |......#\n" +
                "#...............#\n" +
                "######.....######\n");


        System.out.println(

                "######.....######\n" +
                "#.......@.......#\n" +
                "#.....|[_]|.....#\n" +
                "#...../| |......#\n" +
                "#...............#\n" +
                "#...............#\n" +
                "#........_......#\n" +
                "#.......(_).....#\n" +
                "#.....I(___)I...#\n" +
                "#...../.I.I.....#\n" +
                "######.....######\n");

        System.out.println(

                "######.....######\n" +
                "#.......@.......#\n" +
                "#.....|[_]|.....#\n" +
                "#...../| |......#\n" +
                "#...............#\n" +
                "#.....|----|....#\n" +
                "#.....|----|....#\n" +
                "#################\n");


        System.out.println(

                "#################\n" +
                "#...[ ]...[ ]...#\n" +
                "#...............#\n" +
                "#...@.......0...#\n" +
                "#.|[_]|...|[_]|.#\n" +
                "#./| |.....| |o.#\n" +
                "#...............#\n" +
                "######.....######\n");
    }



}

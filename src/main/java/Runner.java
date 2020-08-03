
import armory.PlateArmour;
import armory.Sword;
import enemies.Enemy;
import enemies.Orc;
import healingTools.Potion;
import players.Barbarian;
import players.Cleric;
import players.Knight;
import players.Wizard;
import rooms.EnemyRoom;
import rooms.Exit;
import rooms.TreasureRoom;
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
        Orc orc = new Orc("Grishnákh", 10);

        // Rooms
        EnemyRoom enemyRoom = new EnemyRoom(Exit.SOUTH);
        TreasureRoom treasureRoom = new TreasureRoom(200, Exit.NORTH);

        // IntroRoom
        System.out.println(">>> In a cold and dark cobbled room, a voice whispers in the shadows:\n");
        System.out.println("VOICE: Knight, what's your name?\n");
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

        // Knight gets Sword
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

        System.out.println(">>> Press Enter to continue...");
        try {
            System.in.read();
        } catch (Exception e) {
        }


        // Knight exits IntroRoom
        System.out.println(

                        "#################\n" +
                        "#...[ ]...[o]...#\n" +
                        "#...............#\n" +
                        "#.......@.......#\n" +
                        "#.....|[_]|.....#\n" +
                        "#...../| |......#\n" +
                        "#...............#\n" +
                        "######.....######\n");

        System.out.println("VOICE: Now, get rid of him and bring me something shiny!\n");
        System.out.println(">>> You hear noises outside. Do you want to exit the room?\n");
        System.out.println(">>> Press Enter to exit the room...");
        try {
            System.in.read();
        } catch (Exception e) {
        }


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

        System.out.println("GRISHNAKH: Good evening kind sir. I regret to say that you are not allow to pass. At least not alive.\n");
        knight.takeDamage(10);
        System.out.println(">>> Grishnákh the Orc attacks. It causes you 10 of damage with his sword.\n");
        System.out.println(">>> Press Enter to attack...");
        try {
            System.in.read();
        } catch (Exception e) {
        }


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

        knight.attack(sword, orc);
        System.out.println(">>> Your attack causes 10 of damage.\n");
        System.out.println(">>> Grishnákh the Orc is dead. You can exit the room.\n");
        System.out.println(">>> Press Enter to access the next room...");
        try {
            System.in.read();
        } catch (Exception e) {
        }
        // Knight collects Treasure
        // Knight exits TreasureRoom


        System.out.println(

                "######.....######\n" +
                "#.......@.......#\n" +
                "#.....|[_]|.....#\n" +
                "#...../| |......#\n" +
                "#...............#\n" +
                "#.....|----|....#\n" +
                "#.....|----|....#\n" +
                "#################\n");

        knight.collectTreasure(knight, treasureRoom);
        System.out.println(">>> You collect 200 shiny pieces of gold.\n");
        System.out.println(">>> Press Enter to come back to the first room...");
        try {
            System.in.read();
        } catch (Exception e) {
        }

        // Cleric heals Knight
        System.out.println(
                "#################\n" +
                "#...[ ]...[ ]...#\n" +
                "#...............#\n" +
                "#...@.......0...#\n" +
                "#.|[_]|...|[_]|.#\n" +
                "#./| |.....| |o.#\n" +
                "#...............#\n" +
                "######.....######\n");


        System.out.println("THE BLUE CLERIC: Cheers for that. Let me heal you.\n");
        System.out.println(">>> The Blue Cleric uses potion on you. You recover 20 points of health.\n");
        System.out.println(">>> The End?");

    }

}

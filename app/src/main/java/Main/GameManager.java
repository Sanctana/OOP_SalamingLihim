package Main;

import Characters.Player;
import java.util.Scanner;
import Characters.Race.*;
import Utilities.Factory.Factory;
import Utilities.Factory.Race.*;
import Characters.Class.*;

public class GameManager {
    private Player player;
    private Scanner scanner;

    public GameManager() {
        scanner = new Scanner(System.in);
    }

    public void init() {
        Race race;
        Factory factory;

        System.out.println("+------------------------------------------------+");
        System.out.println("|             Welcome, Traveler, to              |");
        System.out.println("|              *  SALAMING LIHIM  *              |");
        System.out.println("|                                                |");
        System.out.println("|   Where myths breathe, and shadows move        |");
        System.out.println("|        in Biringan's hidden realm...           |");
        System.out.println("+------------------------------------------------+");
        System.out.println();
        System.out.println("Prepare yourself — your journey begins now!");
        System.out.println("Press ENTER to begin...");
        scanner.nextLine();

        System.out.println("Choose your race: ");
        System.out.println("1. Tikbalang");
        System.out.println("2. Kapre (unavailable)");
        System.out.println("3. Manananggal (unavailable)");
        System.out.println("Choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                factory = new TikbalangFactory();
                break;
            // case 2:
            // factory = new KapreFactory();
            default:
                System.out.println("Invalid! Defaulting to Tikbalang.");
                factory = new TikbalangFactory();
                break;
        }

        race = factory.createRace();
        System.out.println(String.format("(%s, %d, %d)", race.getName(),
                race.getBaseHP(), race.getBaseMana()));

        ClassType classType = factory.createClass();
        System.out.println("Please enter a name for your character: ");
        String name = scanner.nextLine();
        player = new Player(name, race, classType);
        System.out.println(player);
    }
}

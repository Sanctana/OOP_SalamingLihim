package game;

import game.characters.*;
import game.story.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Race tikbalang = new Tikbalang();
        //Race kapre = new Kapre();

        System.out.println("+================================================+");
        System.out.println("|             Welcome, Traveler, to              |");
        System.out.println("|              *  SALAMING LIHIM  *              |");
        System.out.println("|                                                |");
        System.out.println("|   Where myths breathe, and shadows move        |");
        System.out.println("|        in Biringan's hidden realm...           |");
        System.out.println("+================================================+");
        System.out.println();
        System.out.println("Prepare yourself -- your journey begins now!");
        System.out.println("Press ENTER to begin...");
        sc.nextLine();

        // Insert Introduction Story:
        Intro.playIntro(sc);

        // Race Selection:
        // display background per race
        // Confirmation
        // Display (Race, Base HP, Base Mana)
        // Class selection based on Race:
        RaceSelection.chooseRace(sc);

        System.out.println("Choose your class: ");


        // Class confirmation

        // Display Final Player Stats
        //Player.displayStats();
        // Start Story and Intro to First Mission...


    }
}

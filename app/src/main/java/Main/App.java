package Main;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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

        // Insert Introduction Story:
        // Race Selection:

        System.out.println("Choose your race: ");
        System.out.println("1. Tikbalang");
        System.out.println("2. Kapre (unavailable)");
        System.out.println("3. Manananggal (unavailable)");
        System.out.println("Choice: ");
        int choice = scanner.nextInt();

        // display background per race
        // Confirmation
        // Display (Race, Base HP, Base Mana)
        // Class selection based on Race:

        System.out.println("Choose your class: ");

        switch (choice) {
            case 1:

            case 2:

            case 3:

            default:
                System.out.println("Invalid! ");
        }
        // Class confirmation
        // Display Final Player Stats
        // Start Story and Intro to First Mission

        scanner.close();
    }
}

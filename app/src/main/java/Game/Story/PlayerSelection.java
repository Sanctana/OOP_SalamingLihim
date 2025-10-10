package Game.Story;

import Characters.Player;
import Characters.Race.Race;
import Characters.Class.*;
import Game.GameManager;
import Utilities.Factory.*;
import Utilities.Factory.Race.*;

import static Utilities.Terminal.TerminalIO.*;

public class PlayerSelection implements Story {

    @Override
    public void startSection() {
        Factory chosenRace = null;
        Race race = null;

        while (chosenRace == null) {
            // interactive menu using arrow keys
            String[] options = { "Tikbalang", "Kapre", "Manananggal" };
            int index = 0;
            boolean madeChoice = false;
            int choice = -1;

            while (!madeChoice) {
                clearTerminal();
                System.out.println("\n\n[Please choose your mythical creature]\n");
                for (int i = 0; i < options.length; i++) {
                    if (i == index) {
                        // reverse video for highlight
                        System.out.println("\u001B[7m" + (i + 1) + ". " + options[i] + "\u001B[0m");
                    } else {
                        System.out.println((i + 1) + ". " + options[i]);
                    }
                }
                System.out.println("\nUse UP/DOWN arrows to move, ENTER to select.");

                int[] seq = readKeySequence();
                if (seq == null || seq.length == 0) {
                    continue;
                }

                // Arrow keys typically come as [27, 91, 65] (up) or [27,91,66] (down)
                if (seq.length >= 3 && seq[0] == 27 && seq[1] == 91) {
                    if (seq[2] == 65) { // up
                        index = (index - 1 + options.length) % options.length;
                    } else if (seq[2] == 66) { // down
                        index = (index + 1) % options.length;
                    }
                } else {
                    int k = seq[0];
                    if (k == 10 || k == 13) { // Enter (LF or CR)
                        choice = index;
                        madeChoice = true;
                    } else if (k == 'w' || k == 'W') { // optional vim-style keys
                        index = (index - 1 + options.length) % options.length;
                    } else if (k == 's' || k == 'S') {
                        index = (index + 1) % options.length;
                    }
                }
            }

            // map choice index to factories
            switch (choice + 1) {
                case 1:
                    chosenRace = new TikbalangFactory();
                    break;

                // implement kapre
                // implement manananggal

                default:
                    System.out.println("Invalid choice! Please pick a valid choice.");
                    chosenRace = null;
                    break;
            }

            if (chosenRace == null) {
                continue;
            }

            // Confirmation!!

            race = chosenRace.createRace();
            System.out.print("You have chosen " + race.getName() + ". Confirm? (Y/N): ");
            String confirm = getScanner().nextLine().trim().toUpperCase(); // trims unnecessary shiz like spaces for
                                                                           // easy input

            if (confirm.equals("Y")) {

                ClassType classType = chosenRace.createClass();
                clearBuffer();
                System.out.print("\n[Please enter name]: ");
                String name = getScanner().nextLine().trim();

                Player player = new Player(name, race, classType);
                System.out.println(player);
                GameManager.setPlayer(player);
                System.out.print("Press ENTER to continue...");
                clearBuffer();

            } else {
                chosenRace = null; // resets the choice
                System.out.println("Okay! Let's check out the selection once more.");
            }
        }
    }
}

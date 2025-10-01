package Game.Story;

import Characters.Player;
import Characters.Race.Race;
import Game.GameManager;
import Utilities.Factory.*;
import Utilities.Factory.Race.*;

import static Game.GameManager.getScanner;

public class PlayerSelection implements Story {

    @Override
    public void startSection() {
        Factory chosenRace = null;
        Race race = null;

        while (chosenRace == null) {
            System.out.println("\n\n[Please choose your mythical creature]");
            System.out.println("1. Tikbalang");
            System.out.println("2. Kapre");
            System.out.println("3. Manananggal");
            System.out.print("Choice: ");

            int choice = getScanner().nextInt();

            if (getScanner().hasNextLine()) { // clear the buffer
                getScanner().nextLine();
            }

            do {
                switch (choice) {
                    case 1:
                        chosenRace = new TikbalangFactory();
                        break;

                    // implement kapre
                    // implement manananggal

                    default:
                        System.out.println("Please pick a valid choice.");
                        break; // asks for race again ??? or supposed to
                }
            } while (chosenRace == null);

            // Confirmation!!

            race = chosenRace.createRace();
            System.out.print("You choose " + race.getName() + ". Confirm? (Y/N): ");
            String confirm = getScanner().nextLine().trim().toUpperCase(); // trims unnecessary shiz like spaces for
                                                                           // easy input

            if (confirm.equals("Y")) {
                Player player = new Player(race, chosenRace.createClass());
                System.out.println(player);
                GameManager.setPlayer(player);
            } else {
                chosenRace = null; // resets the choice
                System.out.println("Okay! Let's check out the selection once more.");
            }
        }
    }
}

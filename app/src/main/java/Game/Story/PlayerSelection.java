package Game.Story;

import Characters.Race.Race;
import Characters.Class.*;
import Characters.Entities.Player;
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

            do { //mag try catch
                switch (choice) {
                    case 1:
                        chosenRace = new TikbalangFactory();
                        break;

                    // implement kapre
                    // implement manananggal

                    default:
                        System.out.println("Invalid choice! Please pick a valid choice.");
                        break;
                }
            } while (chosenRace == null);

            // Confirmation!!

            race = chosenRace.createRace();
            System.out.print("You have chosen " + race.getName() + ". Confirm? (Y/N): ");
            String confirm = getScanner().nextLine().trim().toUpperCase(); // trims unnecessary shiz like spaces for
                                                                           // easy input

            if (confirm.equals("Y")) {

                ClassType classType = chosenRace.createClass();
                getScanner().nextLine();
                System.out.print("\n[Please enter name]: ");
                String name = getScanner().nextLine().trim();


                Player player = new Player(name, race, classType);
                System.out.println(player);
                GameManager.setPlayer(player);
                System.out.print("Press ENTER to continue...");
                getScanner().nextLine();

            } else {
                chosenRace = null; // resets the choice
                System.out.println("Okay! Let's check out the selection once more.");
            }
        }
    }
}

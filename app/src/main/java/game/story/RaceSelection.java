package game.story;

import game.characters.Race;
import game.characters.Tikbalang;

import java.util.Scanner;

public class RaceSelection {
    public static Race chooseRace(Scanner sc) {

            Race chosenRace = null;
            boolean confirmed = false;

            while (!confirmed) { //Looops until Player confirms a Race
                System.out.println("\n\n[Please choose your mythical creature]");
                System.out.println("1. Tikbalang");
                System.out.println("2. Kapre");
                System.out.println("3. Manananggal");
                System.out.print("Choice: ");

                int choice = sc.nextInt();
                sc.nextLine();

                switch(choice) {
                    case 1:
                        System.out.println("+===================== Tikbalang ============================+");
                        System.out.println("A tikbalang is a mythical, half-human, half-horse creature, known for its horse-like head and hooves, ");
                        System.out.println("long limbs, and ability to lead travelers astray in forests and mountains. Often portrayed as a");
                        System.out.println("deceptive prankster or trickster, it can also be seen as a guardian of nature.\n");
                        System.out.println("HP: 95");
                        System.out.println("Mana: 80");
                        System.out.println("+=============================================================+");

                        chosenRace = new Tikbalang();
                        break;

                    //implement kapre
                    //implement manananggal

                    default:
                        System.out.println("Please pick a valid choice.");
                        break; //asks for race again ??? or supposed to

                }

                //Confirmation!!
                System.out.print("You choose " + chosenRace.getName() + ". Confirm? (Y/N): ");
                String confirm =  sc.nextLine().trim().toUpperCase(); // trims unnecessary shiz like spaces for easy input

                if (confirm.equals("Y")) {
                    confirmed = true;
                    System.out.println("You are " + chosenRace.getName());
                } else {
                    System.out.println("Okay! Let's check out the selection once more.");
                }
            }
            return chosenRace;

    }
}

package Game.Story;

import Characters.Player;
import Game.GameManager;
import static Game.GameManager.getScanner;

public class BiringanIntro implements Story {

    @Override
    public void startSection() {

        Player player = GameManager.getPlayer();

        String className = player.getPlayerClass().getName();
        String playerName = player.getName();

        System.out.println("With the hero's experience as a " + className +
                ", he/she starts to\nfind clues in the heart of Biringan City. " +
                playerName + " is taking the\nfirst step to the battle that will determine the fate of their kind.");
        System.out.println();
        System.out.print("Press ENTER to continue...");
        getScanner().nextLine();
        System.out.println("+------------------------------------------------+");
        System.out.println("|                                                |");
        System.out.println("|                BIRINGAN CITY                   |");
        System.out.println("|                                                |");
        System.out.println("|     A city of light and lurking darkness.      |");
        System.out.println("|                                                |");
        System.out.println("+------------------------------------------------+");
        System.out.println();
        System.out.println();

        System.out.println("A city filled with glittering riches beyond compare that shines like a\n" +
                "beacon for all the darkest creatures of the night. This city may be bright,\n" +
                "but it is also deceiving... there is always a darkness lurking behind.\n" +
                "With this in mind, you prepare to find the trails and clues about the ones\n" +
                "leading the darkness to devour the light of the city. You roam about the city,\n" +
                "currently finding trouble in the alleys. Darkness usually occurs here, right?\n");
        System.out.println();
        System.out.println("You delve deep into the dark alley, and just as you thought that it was\n" +
                "too peaceful, you hear a cry of distress.");
        System.out.println();
        System.out.print("Press ENTER to continue...");
        getScanner().nextLine();
    }

}

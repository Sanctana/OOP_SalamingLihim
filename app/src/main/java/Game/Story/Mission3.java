package Game.Story;

import Game.GameManager;
import java.util.Scanner;

public class Mission3 implements Story {

    @Override
    public void startSection() {
        Scanner sc = GameManager.getScanner();

        System.out.println();
        System.out.println("================================================");
        System.out.println("          MISSION 3: THE HEART OF DARKNESS      ");
        System.out.println("================================================");
        System.out.println();

        System.out.println("Enlightened with the clues from the Information Guild, you hurry to the Dark Forest.");
        System.out.println("The path becomes rough, bushes thick and thorny, leaving scratches on whoever is unlucky enough to come into contact with it.");
        System.out.println("The grass gradually becomes taller, and trees start to cluster as you enter the forest.");
        System.out.println("The mysterious color of the bark of the trees complements the shadows cast upon the dense leaves of the forest.");
        System.out.println("Were humans to come to this place, they would no doubt be lost and blinded.");
        System.out.println("However, as a mythical creature, the forest merely enchants you, its beauty vibrant in your eyes.");
        System.out.println(">> Press ENTER to continue...");
        sc.nextLine();

        System.out.println();
        System.out.println("You venture deeper into the forest and start to see the tell-tale tracks of wagons and footsteps.");
        System.out.println("A little while after, you hear stomping and the sound of creaky wagon wheels turning through the soil.");
        System.out.println();
        System.out.println("There you see tiyanaks moving the wagon full of unconscious bodies of enkantos and diwatas.");
        System.out.println("And seeing the one leading them reminded you of what Sean previously said—it was the giant entity, the Bungisngis.");
        System.out.println("Despite his smile, the giant appears annoyed at the fact that the tiyanaks are having trouble pushing and pulling the wagon.");
        System.out.println("You move towards the group quietly, hiding behind the bodies of trees, and observe what they might do.");
        System.out.println(">> Press ENTER to continue...");
        sc.nextLine();

        System.out.println();
        System.out.println("The Bungisngis, still smiling, looks at the tiyanaks in disappointment and turns its eyes upon the bodies of the diwatas.");
        System.out.println("Its eyes brighten at the idea that flashes into its head.");
        System.out.println("You watch in nervous anticipation as the Bungisngis walks towards the wagon,");
        System.out.println("and quietly note how even the tiyanaks scamper away from the giant,");
        System.out.println("as if being in close proximity to the Bungisngis might turn them from allies to prey.");
        System.out.println();
        System.out.println("You ready yourself with your weapon as the giant reaches out to the wagon and raises the limp body of a diwata.");
        System.out.println("The Bungisngis opens its mouth, salivating at the sight of its meal.");
        System.out.println(">> Press ENTER to continue...");
        sc.nextLine();

        System.out.println();
        System.out.println("Just then, a whirl of wind slices the skin of the giant’s arm, causing it to drop the unconscious diwata back on the wagon.");
        System.out.println("Another diwata from the wagon rises and uses the wind to bring some distance between the wagon and the Bungisngis.");
        System.out.println("You step out of hiding and move yourself between the wagon and the group of the Bungisngis.");
        System.out.println();
        System.out.println("Conscious Diwata: Are you here to rescue us?");
        System.out.println();
        System.out.println("You: I am. Wake the others up and head to the city! I’ll stop them.");
        System.out.println();
        System.out.println("Conscious Diwata: Alright!");
        System.out.println();
        System.out.println("[You encountered 5 tiyanaks and a Bungisngis. Choose a target and an attack] - fight\n" +
                "{only tiyanaks can be targeted}\n" +
                "{Mini boss can only be targeted after wiping out the henchmen}\n");
        System.out.println(">> A battle begins!");
        System.out.println(">> Press ENTER to continue...");
        sc.nextLine();

        // Here you can start the battle with Bungisngis and Tiyanaks
        // Example: new Battle(GameManager.getPlayer(), new Enemy[] { new Bungisngis(), new Tiyanak(), new Tiyanak() }).startBattle();

        System.out.println();
    }
}

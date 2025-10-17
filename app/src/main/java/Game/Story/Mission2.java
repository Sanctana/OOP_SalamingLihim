package Game.Story;

import static Game.GameManager.getScanner;
public class Mission2 implements Story {

    @Override
    public void startSection() {
        System.out.println();
        System.out.println("================================================");
        System.out.println("          MISSION 2: A QUESTION OF HONOR         ");
        System.out.println("================================================");
        System.out.println();

        System.out.println("After your encounter with Sean, your spirits are high.");
        System.out.println("Your heart soars with hope at the thought of being able to help someone.");
        System.out.println("But you still have a long day ahead of you.");
        System.out.println("It is now time to make your way to the Information Guild");
        System.out.println("in order to get to the bottom of the strange air swirling around Biringan City.");
        System.out.println("You decide to take a shortcut through an empty alley.");
        System.out.println();

        System.out.println("But as you round the corner, you see that this alley was not quite as empty");
        System.out.println("as you had thought. There is a man sprawled in a heap on the floor,");
        System.out.println("seemingly down on his luck. You wrinkle your nose as the stains and the stench");
        System.out.println("of the grimy streets have seemingly merged with the tattered clothing the man wears.");
        System.out.println("His head whips toward you the moment you walk by, and he holds out an open palm.");
        System.out.println();
        System.out.println(">> Press ENTER to continue...");
        System.out.println();

        System.out.println("Beggar: Please, kind stranger, do you have any barya to spare?");
        System.out.println("I have been sick for days, but I do not have the twenty pesos needed to pay for medicine.");
        System.out.println("Won’t you spare a poor beggar some mercy?");
        System.out.println();

        System.out.println("The man starts coughing halfway through his last sentence,");
        System.out.println("his body shaking violently as he’s overwhelmed by the coughing fit,");
        System.out.println("and you fight the urge to say yes to him immediately.");
        System.out.println("You may not be stricken with a terrible illness, but you are not much better off");
        System.out.println("than this beggar, either, for you only have twenty pesos to your name.");
        System.out.println("But you know that in this part of the city, it’s every man for himself.");
        System.out.println("If you do not help him, no one else will, and he will be a dead man by tomorrow.");
        System.out.println();

        System.out.println(">> Press ENTER to continue...");
        System.out.println();

        System.out.println(">> Do you give away your only money to help a begging stranger?");
        System.out.println("[Press 1] Yes");
        System.out.println("[Press 0] No");
        System.out.println();

        System.out.println("Enter your choice: ");
        int choice = -1;
        while (true) { // repeat until valid
            if (getScanner().hasNextInt()) {
                choice = getScanner().nextInt();
                if (choice == 0 || choice == 1) {
                    break; // valid input
                } else {
                    System.out.print("⚠️ Invalid choice! Please enter 0 or 1: ");
                }
            } else {
                System.out.print("⚠️ Invalid input! Please enter a number (0 or 1): ");
                getScanner().next(); // clear invalid input
            }
        }

        if (choice == 0) {
            System.out.println("You have chosen not to help the beggar.");
            System.out.println();
            System.out.println("You: I’m sorry, friend, but I do not have the money to spare. Best of luck to you.");
            System.out.println();
            System.out.println("With those parting words, you walk away. The crestfallen look on the man’s face");
            System.out.println("stays with you as you make your way towards the Information Guild,");
            System.out.println("but you quickly put it out of your mind. Great adventures await, after all.");
            // GameManager.getPlayer().setHelpedBeggar(false);
        }
        else {
            System.out.println("You have chosen to help the beggar.");
            System.out.println();
            System.out.println("You: Here’s twenty pesos. I’m sorry, it’s all I have, but I do hope you can use it to seek treatment for your illness.");
            System.out.println();
            System.out.println("Beggar: You would offer me all the money you have?");
            System.out.println();
            System.out.println("You: Why, of course. You seem to need it more than I do. It’s only the right thing to do.");
            System.out.println();
            System.out.println("To your surprise, the beggar surges upward with surprising strength,");
            System.out.println("given his earlier condition, and envelopes you in a hug.");
            System.out.println();
            System.out.println("Beggar: Thank you so much! I have been wasting away in this alley for a week,");
            System.out.println("and you are the first to ever offer me kindness.");
            System.out.println();
            System.out.println("You: It was no problem, truly. I must go, though, for I am on a mission. Best of luck to you, my friend.");
            System.out.println();
            System.out.println("Beggar: And to you. May the Gods bless you.");
            // GameManager.getPlayer().setHelpedBeggar(true);
        }
        System.out.println(">> Press ENTER to continue...");
        getScanner().nextLine();

        System.out.println();
        System.out.println("Smiling warmly, you walk away from the alley and towards the Information Guild.");
        System.out.println("That is when you remember that you had some suman tucked away in your pocket for lunch.");
        System.out.println("You think of the beggar and decide that he needs it more than you do.");
        System.out.println("But when you reach into your pocket, what greets your hand is not just the decadent suman,");
        System.out.println("but the feeling of cold, hard coins as well.");
        System.out.println("Taking it out, you realize there are five pieces of barya—");
        System.out.println("when before you were certain all your money was given away to the beggar.");
        System.out.println("And when you look back at the alley, it now appears completely empty.");
        System.out.println("Did you just get played by an encanto?");
        System.out.println(">> Press ENTER to continue...");
        getScanner().nextLine();

        System.out.println();
        System.out.println("Inside, the air hums with the thick scent of ink, parchment, and candlewax.");
        System.out.println("Shelves groan under the weight of ancient scrolls, tomes, and artifacts that murmur faintly");
        System.out.println("in varying tongues of Bisaya, Waraynon, Tagalog, and even some ancient languages now lost to time.");
        System.out.println("Watchful slitted eyes follow you as you step forward.");
        System.out.println();

        System.out.println("An aged Tamawo scribe greets you. Despite his age,");
        System.out.println("his pale, handsome face and sparkling skin radiate disarming allure.");
        System.out.println();
        System.out.println("Scribe: You carry the scent of the alleyways with you, child.");
        System.out.println("You must have travelled far just to find our humble guild.");
        System.out.println("Tell me, what knowledge do you seek?");
        System.out.println();

        System.out.println("You: I am investigating the recent increase in illicit happenings around the city.");
        System.out.println("My friend Sean told me that there have been rumors of Diwatas and Encantos going missing lately.");
        System.out.println("He told me that you would be able to offer me more information about that.");
        System.out.println();

        System.out.println("Scribe: The vanishings are no mere rumor. Our informants speak of Bungisngis prowling the outskirts.");
        System.out.println("These laughing beasts, though dim of wit, are bound by new masters.");
        System.out.println("They work with tiyanaks who drag Enkantos and Diwatas into the Dark Forest,");
        System.out.println("where they are carted off like mere cattle and brought to the land of the Aswangs.");
        System.out.println();

        System.out.println("He presses a worn map into your hand, the edges trembling faintly as though the parchment itself feared what it depicted.");
        System.out.println("Scribe: If you truly wish to stand against them, then steel yourself.");
        System.out.println("It is not named the Dark Forest for no reason.");
        System.out.println("The forest is alive. And it does not forgive trespassers easily.");
        System.out.println(">> Press ENTER to continue...");
        getScanner().nextLine();

        System.out.println();
        System.out.println("The chamber grows colder as the candles flicker low.");
        System.out.println("Outside, the wind howls, carrying with it faint echoes of laughter—low, booming, and unending.");
        System.out.println();
        System.out.println("Your next step is clear. The Dark Forest awaits.");
        System.out.println(">> Press ENTER to continue...");
        System.out.println();

    }
}


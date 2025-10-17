package Game.Story;

import Characters.Enemies.*;
import Characters.Player;
import Game.Battle;
import Game.GameManager;

import java.util.ArrayList;
import java.util.List;

import static Game.GameManager.getScanner;

public class Mission1 implements Story {

    @Override
    public void startSection() {
        System.out.println();
        System.out.println("================================================");
        System.out.println("         MISSION 1: THE HEART OF A HERO         ");
        System.out.println("================================================");
        System.out.println();


        System.out.println("???: Someone help! Please! A thief has stolen my merchandise!");
        System.out.println();
        System.out.println("[You encountered 5 thief duwendes. Choose a target and an attack]");
        System.out.println(">> A battle begins!");
        System.out.println(">> Press ENTER to continue...");
        System.out.println();

        Player player = GameManager.getPlayer();

        List<Enemy> enemies = new ArrayList<>();
        for(int i = 0; i < 5; i++) {
            enemies.add(new Duwende());
        }

        Battle battle = new Battle(player, enemies);
        battle.startBattle();

        if (player.isAlive()) {
            System.out.println("\nSean:  Thank you so much. I owe you my livelihood. I wouldn’t\n" +
                    "have made it through the end of this month without that merchandise. Especially\n" +
                    "with the darkening atmosphere of the city– oop! Ishouldn’thavesaidthat. \n");

            System.out.println(player.getName() + ": I’m actually investigating that. If you want to repay me, tell me everything you know.");

            System.out.println(" Well, I am indebted to you, so I shall tell you all that I can.\n" +
                    "I heard that there were an increasing number of Enkantos and Diwatas missing.\n" +
                    "The word on the street is that some sort of giant is behind it. One can only hope\n" +
                    "it isn't for a sacrificial ritual. If you want to know more, you might want to head\n" +
                    " to the Information Guild. My name is Sean. Tell them I sent you, and they might\n" +
                    "give you more information.");

            System.out.print(">> Press ENTER to continue...");
            getScanner().nextLine();

            System.out.println("You agree and go on your way.");
        }
    }

}

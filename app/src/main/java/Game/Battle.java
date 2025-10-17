package Game;

import Characters.Entities.Enemies.Enemy;
import Characters.Entities.Player;

import java.util.Scanner;
import java.util.List;

public class Battle { // Fix, kay not working nya di papud sure (change if needed)

    // Battle Contents:

    /*
     * Display Round number
     * Display player current hp and mana
     * display ("Your turn! Choose a skill: (display skills1-3)")
     * display who took damaage n how much
     * randomize ang damage sa enemy
     */

    private final List<Enemy> enemies;

    public Battle(List<Enemy> enemies) {
        this.enemies = enemies;
    }

    public void startBattle() {
        Scanner sc = GameManager.getScanner();
        Player player = GameManager.getPlayer();

        System.out.println("\n===== BATTLE START =====");

        for (int round = 1; player.isAlive() && anyEnemyAlive(); round++) {
            System.out.println("\n--- Round " + round + " ---");

            // Enemies' turn
            for (Enemy enemy : enemies) {
                player.takeDamage(enemy.attack());
            }

            // Player's turn
            System.out.println("\nYour turn! Choose an action:");
            System.out.println("1. Basic Attack");
            System.out.println("2. Use Skill");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            if (sc.hasNextLine()) {
                sc.nextLine(); // Consume newline
            }

            switch (choice) {
                // Skill skill skill
            }

            removeDefeatedEnemies();
        }

        if (player.isAlive()) {
            System.out.println("\nYou defeated all the enemies!");
        } else {
            System.out.println("\nYou were defeated...");
        }
    }

    private boolean anyEnemyAlive() {
        return enemies.size() > 0;
    }

    private void removeDefeatedEnemies() {
        enemies.removeIf(enemy -> !enemy.isAlive());
    }
}

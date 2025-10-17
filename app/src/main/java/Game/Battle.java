package Game;

import Characters.Player;
import Characters.Enemies.Enemy;
import Actions.Attack;

import java.util.List;
import java.util.Scanner;


public class Battle { // Fix, kay not working nya di papud sure (change if needed)

    //Battle Contents:

    /*Display Round number
    Display player current hp and mana
    display ("Your turn! Choose a skill: (display skills1-3)")
             display who took damaage n how much
    randomize ang damage sa enemy*/

    private final Player player;
    private final Enemy[] enemies;

    public Battle(Player player, Enemy[] enemies) {
        this.player = player;
        this.enemies = enemies;
    }

    public void startBattle() {
        Scanner sc = GameManager.getScanner();

        while(player.isAlive() && anyEnemyAlive()) {
            int round = 1;
            boolean playerTurn = true;

            System.out.println("\n===== BATTLE START =====");

            for(int i = 0; i < enemies.length; i++) {
                Enemy enemy = enemies[i];

                if(anyEnemyAlive()) {
                    Attack attack = enemy.chooseAttack();
                    int damage = attack.getDamage();

                    System.out.println(enemy.getName() + " attacks using " + attack.getName());
                    System.out.println("It dealt " + damage + " damage to you!");

                    player.takeDamage(damage);
                }
            }
        }

        if(player.isAlive()) {
            System.out.println("\nYou defeated all the enemies!");
        } else {
            System.out.println("\nYou were defeated...");
        }
    }

    private boolean anyEnemyAlive() {
        for (int i = 0; i < enemies.length; i++) {
            if (enemies[i].isAlive()) {
                return true;
            }
        }
        return false;
    }
}

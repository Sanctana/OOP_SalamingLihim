package Characters;

import java.sql.SQLOutput;

public class Player {

    private String name;
    private Race race;
    private ClassType classType;
    private int hp;
    private int mana;

    public Player(String name, Race race, ClassType classType) {
        this.name = name;
        this.race = race;
        this.classType = classType;
        this.hp = race.getBaseHP() + classType.getBonusHP();
        this.mana = race.getBaseMana() + classType.getBonusMana();
    }

    public void displayStats() {
        System.out.println("Race: " + race.getName());
        System.out.println("Class: " + classType.getName());
        System.out.println("HP: " + hp + " | Mana: " + mana);
    }

    //Methods to implement:
    // takeDamage (hp - damage)
    // isAlive (check if alive)
    //use skill
}

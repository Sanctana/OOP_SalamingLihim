package Characters;

import Characters.Class.ClassType;
import Characters.Race.Race;

enum Skills {
    SKILL_1, // 0
    SKILL_2, // 1
    SKILL_3, // 2
    SKILL_4 // 3
}

public class Player {
    private Race race;
    private ClassType classType;
    private int hp;
    private int mana;

    public Player(Race race, ClassType classType) {
        this.race = race;
        this.classType = classType;
        this.hp = race.getBaseHP() + classType.getBonusHP();
        this.mana = race.getBaseMana() + classType.getBonusMana();
    }

    public Player setRace(Race race) {
        this.race = race;
        return this;
    }

    public Player setClassType(ClassType classType) {
        this.classType = classType;
        return this;
    }

    public void displayStats() {
        System.out.println("Race: " + race.getName());
        System.out.println("Class: " + classType.getName());
        System.out.println("HP: " + hp + " | Mana: " + mana);
    }

    public Boolean isAlive() {
        return hp > 0;
    }

    public void takeDamage(int damage) {
        hp -= damage;
    }

    public int basicAttack() {
        return race.basicAttack();
    }

    public int useSkill(Skills skill) {
        return classType.useSkill(skill.ordinal());
    }

    @Override
    public String toString() {
        return String.format("Race: %s\nClass: %s\nHP: %d\nMana: %d\n", race.getName(),
                classType.getName(), hp, mana);
    }
}
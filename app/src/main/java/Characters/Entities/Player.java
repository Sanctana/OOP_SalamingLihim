package Characters.Entities;

import Characters.Class.ClassType;
import Characters.Race.Race;

enum Skills {
    SKILL_1, // 0
    SKILL_2, // 1
    SKILL_3, // 2
    SKILL_4 // 3
}

public class Player extends Entity implements Cloneable {
    private Race race;
    private ClassType classType;
    private int mana;

    public Player(String name, Race race, ClassType classType) {
        super(name, race.getBaseHP() + classType.getBonusHP());
        this.mana = race.getBaseMana() + classType.getBonusMana();
        this.race = race;
        this.classType = classType;
    }

    public Player setRace(Race race) {
        this.race = race;
        return this;
    }

    public Player setClassType(ClassType classType) {
        this.classType = classType;
        return this;
    }

    public ClassType getPlayerClass() {
        return classType;
    }

    public int basicAttack() {
        return race.basicAttack();
    }

    public int useSkill(Skills skill) {
        return classType.useSkill(skill.ordinal());
    }

    @Override
    public String toString() {
        return String.format("Name: %s\nRace: %s\nClass: %s\nHP: %d\nMana: %d\n", getName(), race.getName(),
                classType.getName(), getHp(), mana);
    }
}
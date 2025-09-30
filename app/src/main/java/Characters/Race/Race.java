package Characters.Race;

import Actions.Attack;

public class Race {

    private String name;
    private int baseHP;
    private int baseMana;
    private Attack basicAttack;

    public Race(String name, int baseHP, int baseMana, Attack basicAttack) {
        this.name = name;
        this.baseHP = baseHP;
        this.baseMana = baseMana;
        this.basicAttack = basicAttack;
    }

    public String getName() {
        return name;
    }

    public int getBaseHP() {
        return baseHP;
    }

    public int getBaseMana() {
        return baseMana;
    }

    /**
     * Get the damage of the basic attack.
     * 
     * @return an integer representing the damage of the basic attack.
     */
    public int basicAttack() {
        return basicAttack.getDamage();
    }
}

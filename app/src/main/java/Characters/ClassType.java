package Characters;

public class ClassType {

    private String name;
    private int bonusHP;
    private int bonusMana;

    public ClassType(String name, int bonusHP, int bonusMana) {
        this.name = name;
        this.bonusHP = bonusHP;
        this.bonusMana = bonusMana;
    }

    public String getName() {
        return name;
    }

    public int getBonusHP() {
        return bonusHP;
    }

    public int getBonusMana() {
        return bonusMana;
    }

}

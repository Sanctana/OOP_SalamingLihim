package Characters.Class;

import Actions.Attack;

public class ClassType {

    private String name;
    private int bonusHP;
    private int bonusMana;
    private Attack[] skills;

    public ClassType(String name, int bonusHP, int bonusMana, Attack[] skills) {
        this.name = name;
        this.bonusHP = bonusHP;
        this.bonusMana = bonusMana;
        this.skills = skills;
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

    public String getSkillName(int index) {
        if (index < 0 || index >= skills.length) {
            System.out.println("Invalid skill index.");
            return "";
        }

        return skills[index].getName();
    }

    public int useSkill(int index) {
        if (index < 0 || index >= skills.length) {
            System.out.println("Invalid skill index.");
            return 0;
        }

        return skills[index].getDamage();
    }

}

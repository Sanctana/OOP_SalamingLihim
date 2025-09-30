package Actions;

public class Attack {
    private String name;
    private int minDamage;
    private int maxDamage;

    public Attack(String name, int damage) {
        this.name = name;
        minDamage = maxDamage = damage;
    }

    public Attack(String name, int minDamage, int maxDamage) {
        this.name = name;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return (int) (Math.random() * (maxDamage - minDamage + 1)) + minDamage;
    }

    @Override
    public String toString() {
        return name + " (Damage: " + minDamage + (minDamage != maxDamage ? "-" + maxDamage : "") + ")";
    }
}

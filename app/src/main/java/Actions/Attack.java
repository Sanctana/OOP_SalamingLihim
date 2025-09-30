package Actions;

public class Attack {
    private String name;
    private int min;
    private int max;

    public Attack(String name, int damage) {
        this.name = name;
        min = max = damage;
    }

    public Attack(String name, int min, int max) {
        this.name = name;
        this.min = min;
        this.max = max;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    @Override
    public String toString() {
        return name + " (Damage: " + min + (min != max ? "-" + max : "") + ")";
    }
}

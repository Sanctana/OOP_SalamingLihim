package Characters.Enemies;

import Actions.Attack;

public class Duwende implements Enemy {

    private final String name;
    private int hp;
    private Attack[] attacks;

    public Duwende() {
        this.name = "Duwende";
        this.hp = 100;
        this.attacks = new Attack[]{
                new Attack("Mischievous Stomp", 0, 25)
        };
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getHp() {
        return hp;
    }

    @Override
    public void takeDamage(int damage) {
        hp -= damage;
        if (hp < 0) hp = 0;
    }

    @Override
    public boolean isAlive() {
        return hp > 0;
    }
    @Override
    public Attack chooseAttack() {
        return attacks[(int) (Math.random() * attacks.length)];
    }
}




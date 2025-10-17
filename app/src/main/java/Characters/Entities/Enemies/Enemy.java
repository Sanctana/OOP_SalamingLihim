package Characters.Entities.Enemies;

import Actions.Attack;
import Characters.Entities.Entity;

public abstract class Enemy extends Entity {
    private Attack[] attacks;

    public Enemy(String name, int hp, Attack[] attacks) {
        super(name, hp);
        this.attacks = attacks;
    }

    public int attack() {
        int damage = attacks[(int) (Math.random() * attacks.length)].getDamage();
        System.out.println(getName() + " attacks using " + getName());
        System.out.println("It dealt " + damage + " damage to you!");
        return damage;
    }
}

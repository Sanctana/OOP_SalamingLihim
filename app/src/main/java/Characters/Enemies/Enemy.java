package Characters.Enemies;

import Actions.Attack;

public interface Enemy {
    String getName();
    int getHp();
    void takeDamage(int damage);
    boolean isAlive();
    Attack chooseAttack();
}

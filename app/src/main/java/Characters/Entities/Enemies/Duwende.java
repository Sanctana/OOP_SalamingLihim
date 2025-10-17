package Characters.Entities.Enemies;

import Actions.Attack;

public class Duwende extends Enemy {
    public Duwende() {
        super("Duwende", 100, new Attack[] {
                new Attack("Mischievous Stomp", 0, 25)
        });
    }
}

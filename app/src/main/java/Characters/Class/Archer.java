package Characters.Class;

import Actions.Attack;

public class Archer extends ClassType {
    public Archer() {
        super("Archer", 20, 30, new Attack[] {
                new Attack("Triad of Arrows", 55, 85),
                new Attack("Rain of Arrows", 55, 85),
        });
    }
}

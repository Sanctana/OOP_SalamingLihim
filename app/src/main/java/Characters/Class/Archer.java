package Characters.Class;

import Actions.Attack;

public class Archer extends ClassType {
    public Archer() {
        super("Archer", 20, 30, new Attack[] {
                new Attack("Triad of Arrows", 55, 85),
                new Attack("Rain of Arrows", 55, 85),
        });
    }

    @Override
    public String toString() {
        return "Archers are the silent wind on the battlefield—swift, elusive, and deadly from afar. Trained in the\n" +
                "art of trajectory and terrain, they rain down judgment with feathered fury. Whether perched in the\n" +
                "treetops or shadowing prey through the underbrush, the Archer is a master of distance, vision,\n" +
                "and timing. Are you confident enough to let your arrows ride the wind?";
    }
}

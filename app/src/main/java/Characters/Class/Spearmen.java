package Characters.Class;

import Actions.Attack;
public class Spearmen extends ClassType {

    public Spearmen() {
        super("Spearmen", 90, 75, new Attack[] {
                new Attack("Three-strike Stab", 25, 35),
                new Attack("Transcend", 55, 85),
        });
    }

    @Override
    public String toString() {
        return "Spearmen are the iron wall and piercing fang of any disciplined force. With unmatched reach and formation\n" +
                "control, they hold lines, break ranks, and strike with relentless precision. Whether defending a fortress\n" +
                "or charging into chaos, the Spearman is the embodiment of martial order and battlefield dominance. Are\n" +
                "you ready to pierce through any enemy?\n";
    }

}

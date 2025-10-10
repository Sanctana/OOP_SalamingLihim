package Game;

import Characters.Player;
import Game.Story.*;

public class GameManager {
    private static Player player;
    private Story stories[];

    public GameManager() {
        stories = new Story[] {
                new Intro(),
                new PlayerSelection(),
                new BiringanIntro(),
                new Mission1()
        };
    }

    public void run() {
        for (Story story : stories) { // For each story in stories
            story.startSection();
        }
    }

    public static void setPlayer(Player player) {
        GameManager.player = player;
    }

    public static Player getPlayer() {
        return player;
    }
}

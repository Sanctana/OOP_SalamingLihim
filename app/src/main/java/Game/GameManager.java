package Game;

import java.util.Scanner;

import Characters.Player;
import Game.Story.Story;
import Game.Story.Intro;
import Game.Story.PlayerSelection;
import Game.Story.BiringanIntro;
import Game.Story.*;

public class GameManager {
    private static Player player;
    private static final Scanner scanner = new Scanner(System.in);
    private Story stories[];

    public GameManager() {
        stories = new Story[] {
                new Intro(),
                new PlayerSelection(),
                new BiringanIntro(),
                new Mission1()
        };
    }

    public static Scanner getScanner() {
        return scanner;
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

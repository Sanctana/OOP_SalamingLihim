package Game;

import java.util.Scanner;

import Characters.Player;
import Game.Story.Story;
import Game.Story.Intro;
import Game.Story.PlayerSelection;

public class GameManager {
    private static Player player;
    private static final Scanner scanner = new Scanner(System.in);
    private Story stories[];

    public GameManager() {
        stories = new Story[] {
                new Intro(),
                new PlayerSelection()
        };
    }

    public static Scanner getScanner() {
        return scanner;
    }

    public void run() {
        for (Story story : stories) {
            story.startSection();
        }
    }

    public static void setPlayer(Player player) {
        GameManager.player = player;
    }
}

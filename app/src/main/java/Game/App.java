package Game;

import static Utilities.Terminal.TerminalIO.getScanner;;

public class App {
    public static void main(String[] args) {
        GameManager gameManager = new GameManager();
        gameManager.run();
        //
        //
        //

        getScanner().close();
    }
}

package Utilities.Terminal;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import org.jline.reader.EndOfFileException;
import org.jline.terminal.Terminal;
import org.jline.terminal.TerminalBuilder;
import org.jline.terminal.Attributes;
import org.jline.utils.NonBlockingReader;

/**
 * Utility class for terminal input and output operations.
 */
public class TerminalIO {
    private static Terminal terminal = null;
    private static Scanner scanner = new Scanner(System.in);

    private static Terminal getTerminal() throws IOException {
        if (terminal == null) {
            terminal = TerminalBuilder.builder().system(System.console() != null).build(); // use system terminal if
                                                                                           // available

            // ensure terminal is closed on JVM shutdown
            Runtime.getRuntime().addShutdownHook(new Thread(() -> {
                try {
                    if (terminal != null) {
                        terminal.close();
                    }
                } catch (IOException ignored) {
                }
            }));
        }

        return terminal;
    }

    public static Scanner getScanner() {
        return scanner;
    }

    /**
     * Clears the input buffer to avoid unwanted leftover inputs.
     */
    public static void clearBuffer() {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }

    /**
     * Clears the terminal screen.
     */
    public static void clearTerminal() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    /**
     * Animates text output to the terminal with a specified delay between
     * characters.
     * If any key is pressed during the animation, the rest of the text is printed
     * immediately.
     * 
     * @param text  The text to be animated
     * @param delay Delay in milliseconds between characters
     */
    public static void animateText(String text, int delay) {
        try {
            Terminal t = getTerminal();
            Attributes saved = t.enterRawMode(); // save current terminal attributes and enter raw mode
            NonBlockingReader reader = t.reader(); // non-blocking reader to check for input
            PrintWriter writer = t.writer();

            for (int i = 0; i < text.length(); i++) {
                if (reader.read(delay) >= 0) {
                    writer.print(text.substring(i));
                    writer.flush();
                    break;
                } else {
                    writer.print(text.charAt(i));
                    writer.flush();
                }
            }

            reader.close();
            if (saved != null) {
                t.setAttributes(saved);
            }
        } catch (IOException | EndOfFileException e) {
            System.out.print(text);
            System.out.flush();
        }
    }

    /**
     * Reads a sequence of key presses from the terminal, including special keys
     * like
     * arrow keys.
     * 
     * @return An array of integers representing the key codes of the pressed keys.
     */
    public static int[] readKeySequence() {
        try {
            Terminal t = getTerminal();
            Attributes saved = t.enterRawMode();
            NonBlockingReader reader = t.reader();

            int first = reader.read(); // block until first byte
            if (first == -1) {
                reader.close();
                if (saved != null)
                    t.setAttributes(saved);
                return new int[] { -1 };
            }

            // If first is ESC (27), try to read following bytes with a small timeout
            if (first == 27) {
                int second = reader.read(50); // small timeout for following bytes
                int third = -1;
                if (second >= 0) {
                    third = reader.read(50);
                    reader.close();
                    if (saved != null)
                        t.setAttributes(saved);
                    if (third >= 0) {
                        return new int[] { first, second, third };
                    } else {
                        return new int[] { first, second };
                    }
                } else {
                    reader.close();
                    if (saved != null)
                        t.setAttributes(saved);
                    return new int[] { first };
                }
            } else {
                reader.close();
                if (saved != null)
                    t.setAttributes(saved);
                return new int[] { first };
            }
        } catch (IOException | EndOfFileException e) {
            return new int[] { -1 };
        }
    }
}

/**
 * This is my own Exception
 * @author Raphael Troppmann
 * @version 20.02.2026
 */
public class StackEmptyException extends Exception {

    public StackEmptyException() {
        System.err.println("Stack ist leer, Fehlercode:" +-1);
    }

    public StackEmptyException(String message) {
        System.err.println(message);
    }
}

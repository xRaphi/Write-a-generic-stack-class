/**
 * This is my own Exception
 * @author Raphael Troppmann
 * @version 20.02.2026
 */
public class StackFullException extends Exception {

    public StackFullException() {
        System.err.println("Stack ist voll, Fehlercode:" +1);
    }

    public StackFullException(String messsage) {
        System.err.println(messsage);
    }
}

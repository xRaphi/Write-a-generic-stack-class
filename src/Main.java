/**
 * The main class for testing
 * @author Raphael Troppmann
 * @version 03.03.2026
 */
public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        try {
            stack.push("Esel");
            stack.push("Kebab");
            System.out.println("Liste: " + stack.list());
        } catch(StackFullException e) {
            e.printStackTrace();
        }
        try {
            System.out.println("Pop: "+ stack.pop());       //entfernt Kebab
            System.out.println("Liste:" + stack.list());    //zeigt nur Esel an
            System.out.println("Peek: " + stack.peek());    //zeigt Esel an, entfernt aber nichts
            System.out.println("Pop: " + stack.pop());
            System.out.println("Liste: " + stack.list());    //zeigt nichts an, da der Stack leer ist
            System.out.println("Pop: " + stack.pop());      

        } catch(StackEmptyException e) {
            e.printStackTrace();
        }
    }
}
/**
 * This is a generic Stack class with an array attribute
 * @author Raphael Troppmann
 * @version 20.02.2026
 */
public class Stack<T> {

    //Attributes
    int maxSize;
    int top;
    private T[] stack;

    //Constructors
    public Stack() {
        this.maxSize = 10;
        stack = (T[]) new Object[maxSize];
        this.top = -1;
    }

    //methods
    /**
     * The method "push" wich pushes another stack item on the stack except when the stack is full.
     */
    public boolean push(T item) throws StackFullException{
        if(top == maxSize) {
            throw new StackFullException();
        } else {
            if(item == null) {
                return false;
            }
            stack[top+1] = item;
            top += 1;
            return true;
        }
    }

    /**
     * The method "pop" removes the latest stack item on the stack except if the stack is empty.
     */
    public T pop() throws StackEmptyException {
        if(top == -1) {
            throw new StackEmptyException();
        } else {
            for(int i = top; 0 <= i; i--) {
                if(stack[i] != null) {
                    T temp = stack[i];
                    stack[i] = null;
                    top -= 1;
                    return temp;
                }
            }
            return null;
        }
    }

    /**
     * The method "peek" shows the top stack item without removing it
     */
    public T peek() throws StackEmptyException{
        if(top == -1) {
            throw new StackEmptyException();
        } else {
            return stack[top];
        }
    }

    /**
     * The method "list" shows all of the stack items seperetad by ";" and returns it as a String
     */
    public String list() {
        String r = "";
        for(int i = top; 0 <= i; i--) {
            if(stack[i] != null) {
                r += stack[i] + "; ";
            }
        }
        return r;
    }
}

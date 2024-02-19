/**
 * A generic List class.
 * @author Christoph Pasterniak
 * @version 2024-02-12
 */
public class Stack<T> {
    private T[] stack = (T[]) new  Object[1];
    private int count;

    /**
     * sets the count to 0
     */
    public Stack() {
        count = 0;
    }

    /**
     * sets the length of the Array and the count to 0
     * @param ArrayLength
     */
    public Stack(int ArrayLength) {
        this.stack = (T[]) new  Object[ArrayLength];
        count = 0;
    }

    /**
     * Adds one Object to the Array
     * Throws an error when the Array is Full
     * @param ob
     */
    public void push(T ob) {
        int val = count + 1;
        if(count == stack.length) throw new StackFullException("The Stack is full. Push: " + val);
        stack[count++] = ob;
    }

    /**
     * Returns the Object with the highest Index of the Array
     * @return
     */
    public T peek() {
        int val = count - 1;
        if(stack.length != 1 && stack.length != 0 && val >= 0) {
            return stack[val];
        }
        return null;
    }

    /**
     * deletes the object with the highest Index
     * throws Exception if there aren't any objects in the Array
     */
    public T pop() {
        count--;
        if(count == -1) throw new StackEmptyException("der Stack ist empty");
        T lastElement = stack[count];
        stack[count] = null;
        return lastElement;
    }

    /**
     * Makes a StringBuilder that is Converted into a String
     * and then being returned
     * @return
     */
    public String list() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < stack.length; i++) {
            stringBuilder.append(stack[i]);
            if(i != stack.length - 1) stringBuilder.append("; ");
        }
        String returnString = stringBuilder.toString();
        return returnString;
    }
}

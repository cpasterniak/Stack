import java.util.Arrays;

public class Stack<T> {
    private T[] stack = (T[]) new  Object[1];
    private int count = 0;

    public Stack() {

    }

    public void push(T ob) {
        if(count == stack.length) throw new StackFullException("The Stack is full " + count);
        stack[count++] = ob;
    }

    public T peek() {
        int val = count - 1;
        return stack[val];
    }

    public void pop() {
        count--;
        stack[count] = null;
    }
}

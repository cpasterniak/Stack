import java.util.Arrays;

public class Stack<T> {
    private T[] stack = (T[]) new  Object[1];
    private int count;

    public Stack() {
        count = 0;
    }

    public Stack(T[] stack) {
        this.stack = stack;
        count = 0;
    }

    public void push(T ob) {
        int val = count + 1;
        if(count == stack.length) throw new StackFullException("The Stack is full. Push: " + val);
        stack[count++] = ob;
    }

    public T peek() {
        int val = count - 1;
        if(stack.length != 1) {
            return stack[val];
        }
        return null;
    }

    public void pop() {
        count--;
        if(count == -1) throw new StackEmptyException("der Stack ist empty");
        stack[count] = null;
    }
}

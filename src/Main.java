/**
 * The main class with the main method that test the generic array
 * @author Christoph Pasterniak
 * @version 2024-02-12
 */
public class Main {
    public static void main(String[] args) {
        Stack s = new <Integer>Stack(0);
        try {
            s.push(Integer.valueOf(1));
            s.push(Integer.valueOf(2));
            s.push(Integer.valueOf(3));
        }catch(StackFullException e) {
            System.out.println(e);
        }
        try {
            s.pop();
            s.pop();
            s.pop();
        } catch(StackEmptyException e) {
            System.out.println(e);
        }

        System.out.println(s.peek());
        System.out.println(s.list());
    }
}
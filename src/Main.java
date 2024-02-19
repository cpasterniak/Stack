/**
 * The main class with the main method that test the generic array
 * @author Christoph Pasterniak
 * @version 2024-02-12
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("S");
        Stack s = new <Integer>Stack(3);
        try {
            s.push(Integer.valueOf(1));
            s.push(Integer.valueOf(2));
            s.push(Integer.valueOf(3));
        }catch(StackFullException e) {
            System.out.println(e);
        }

        System.out.println(s.peek());
        System.out.println(s.list());

        try {
            s.pop();
            s.pop();
            s.pop();
        } catch(StackEmptyException e) {
            System.out.println(e);
        }

        System.out.println(s.peek());
        System.out.println(s.list());

        System.out.println("S1");
        Stack s1 = new <Integer>Stack(2);
        try {
            s1.push(Integer.valueOf(1));
            s1.push(Integer.valueOf(2));
            s1.push(Integer.valueOf(3));
        }catch(StackFullException e) {
            System.out.println(e);
        }
        System.out.println(s1.peek());
        System.out.println(s1.list());

        System.out.println("S2");
        Stack s2 = new <Integer>Stack(3);
        try {
            s2.push(Integer.valueOf(1));
            s2.push(Integer.valueOf(2));
        }catch(StackFullException e) {
            System.out.println(e);
        }
        System.out.println(s2.peek());
        System.out.println(s2.list());
        try {
            System.out.println(s2.pop());
            System.out.println(s2.pop());
            System.out.println(s2.pop());
        } catch(StackEmptyException e) {
            System.out.println(e);
        }
        System.out.println(s2.peek());
        System.out.println(s2.list());
    }
}
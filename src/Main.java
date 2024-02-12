public class Main {
    public static void main(String[] args) {
        Stack s = new <Integer>Stack();
        try {
            s.push(Integer.valueOf(1));
            s.push(Integer.valueOf(2));
            s.push(Integer.valueOf(3));
            s.pop();
            s.push(Integer.valueOf(3));
        }catch(StackFullException e) {
            System.out.println(e);
        }
        System.out.println(s.peek());
    }
}
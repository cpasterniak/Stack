public class StackFullException extends RuntimeException {
    public StackFullException() {
        super();
    }
    
    public StackFullException(String errormessage) {
        super(errormessage);
    }

}

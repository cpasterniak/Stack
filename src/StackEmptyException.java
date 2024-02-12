public class StackEmptyException extends RuntimeException {
    public StackEmptyException() {
        super();
    }
    public StackEmptyException(String errormessage) {
        super(errormessage);
    }
}

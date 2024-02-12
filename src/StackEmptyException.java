/**
 * An Exception that is thrown when the Array is Empty
 * @author Christoph Pasterniak
 * @version 2024-02-12
 */
public class StackEmptyException extends RuntimeException {
    public StackEmptyException() {
        super();
    }
    public StackEmptyException(String errormessage) {
        super(errormessage);
    }
}

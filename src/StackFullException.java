/**
 * An Exception that is thrown when the Array is Full
 * @author Christoph Pasterniak
 * @version 2024-02-12
 */
public class StackFullException extends RuntimeException {
    public StackFullException() {
        super();
    }
    
    public StackFullException(String errormessage) {
        super(errormessage);
    }

}

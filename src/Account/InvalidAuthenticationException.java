package Account;

public class InvalidAuthenticationException extends Exception{
    public InvalidAuthenticationException(String message) {
        super(message);
    }
}

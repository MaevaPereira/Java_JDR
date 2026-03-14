package dnd.exception;

public class OutOfBoardException extends Exception {
    public OutOfBoardException(String message) {
        super(message); // passe le message à la classe parente Exception
    }
}
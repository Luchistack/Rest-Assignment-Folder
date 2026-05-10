package seekerApp.exceptions;

public class InvalidAgeException extends RuntimeException {
    public InvalidAgeException(String message) {
        super(message);
    }
}
//Thrown when a seeker is below the minimum age
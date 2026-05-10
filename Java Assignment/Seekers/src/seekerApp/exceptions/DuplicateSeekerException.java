package seekerApp.exceptions;

public class DuplicateSeekerException extends RuntimeException {
    public DuplicateSeekerException(String message) {
        super(message);
    }
}

//Thrown when a seeker with the same email already exists

package seekerApp.exceptions;

public class SeekerNotFoundException extends RuntimeException {
    public SeekerNotFoundException(String message) {
        super(message);
    }
}

//Thrown when a seeker with a given id does not exist

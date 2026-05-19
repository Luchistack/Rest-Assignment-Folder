package main.hotel.management.system.exceptions;

public class DuplicateStaffIdException extends RuntimeException {
    public DuplicateStaffIdException(String message) {
        super(message);
    }
}

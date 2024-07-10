package service.exception;

public class InvalidDurationException extends RentalServiceException {
    public InvalidDurationException(String errorMessage) {
        super(errorMessage);
    }
}
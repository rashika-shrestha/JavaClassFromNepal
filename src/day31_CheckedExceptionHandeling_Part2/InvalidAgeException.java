package day31_CheckedExceptionHandeling_Part2;

public class InvalidAgeException extends RuntimeException {

    public InvalidAgeException(String msg) {
        super(msg);
    }
}

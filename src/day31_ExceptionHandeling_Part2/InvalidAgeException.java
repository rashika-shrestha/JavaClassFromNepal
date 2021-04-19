package day31_ExceptionHandeling_Part2;

public class InvalidAgeException extends RuntimeException {

    public InvalidAgeException(String msg) {
        super(msg);
    }
}

package us.peaksoft.homeWorkCat11.exceptions;

public class MyException extends RuntimeException {
    public MyException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyException(String message) {
        super(message);
    }
}

package azib.springrecipe.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class NumberFormatException extends RuntimeException{

    public NumberFormatException() { }
    public NumberFormatException(String message){
        super(message);
    }
    public NumberFormatException(String message, Throwable cause){
        super(message,cause);
    }
}
package pro.sky.calc.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class DivideZeroException extends IllegalArgumentException {

    public DivideZeroException() {
        super("Деление на ноль");
    }
}

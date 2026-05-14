package kkfujita.dev.eventORG.infra.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(NotFoundEventException.class)
    public ResponseEntity<Map<String, String>> handlerNotFoundEventExceptions(NotFoundEventException exception){
        Map<String, String> response = new HashMap<>();
        response.put("error: ", exception.getMessage());
        response.put("message: ", "Please, insert a valid hashid for your event");
        return new ResponseEntity<>(response, HttpStatus.CONFLICT);
    }

}

package kkfujita.dev.eventORG.infra.exception;

import org.hibernate.annotations.NotFound;
import org.springframework.web.bind.annotation.RestControllerAdvice;


public class NotFoundEventException extends RuntimeException{


    public NotFoundEventException (String message){
        super(message);
    }

}

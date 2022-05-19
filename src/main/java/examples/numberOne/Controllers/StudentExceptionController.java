package examples.numberOne.Controllers;

import examples.numberOne.Exceptions.StudentNotFoundException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class StudentExceptionController extends ResponseEntityExceptionHandler {
    @ExceptionHandler(value = {StudentNotFoundException.class})
    protected ResponseEntity<Object> studentNotFoundException(RuntimeException runtimeException, WebRequest webRequest){
        String bodyOfResponse = runtimeException.getMessage();
        return handleExceptionInternal(runtimeException, bodyOfResponse, new HttpHeaders(), HttpStatus.NOT_FOUND, webRequest);
    }
}

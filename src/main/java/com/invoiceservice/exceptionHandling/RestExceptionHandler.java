package com.invoiceservice.exceptionHandling;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler{

    @ExceptionHandler(ApiException.class)
    protected ResponseEntity<Object> handleApiException(ApiException exception, WebRequest request){
		
        ExceptionResponse response = new ExceptionResponse();
        response.setMessage(exception.getMessage());
        response.setStatus(exception.getStatus().value());
        response.setError(exception.getStatus());
        response.setPath(((ServletWebRequest)request).getRequest().getRequestURI().toString());
		
        System.out.println(response);
		
        return new ResponseEntity<>(response, response.getError());
    }
}

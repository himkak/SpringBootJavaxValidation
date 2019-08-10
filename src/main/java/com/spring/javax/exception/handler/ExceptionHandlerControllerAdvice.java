package com.spring.javax.exception.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.spring.javax.model.response.ExceptionResponse;

@RestControllerAdvice
public class ExceptionHandlerControllerAdvice {
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ExceptionResponse> handleValidationException(MethodArgumentNotValidException exc){
		ExceptionResponse respBody=new ExceptionResponse(exc.getBindingResult().getAllErrors().get(0).getDefaultMessage(), "ABCD_1001");
		exc.getParameter();
		
		return new ResponseEntity<>(respBody, HttpStatus.BAD_REQUEST);
	}

}

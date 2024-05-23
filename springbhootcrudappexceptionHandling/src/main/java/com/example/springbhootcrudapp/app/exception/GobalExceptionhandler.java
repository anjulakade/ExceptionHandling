package com.example.springbhootcrudapp.app.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
@Slf4j
@RestControllerAdvice
public class GobalExceptionhandler 
{
	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<ApiErrors> productNotFoundExceptionHandler(ProductNotFoundException e,HttpServletRequest request)
	{
		System.out.println("exception Handle");
		ApiErrors error=new ApiErrors();
	    error.setDate(new Date());
	    error.setStatuscode(HttpStatus.NOT_FOUND.value());
	    error.setMassage(e.getMessage());
	    error.setPath(request.getRequestURI());
	    error.setHttmassage(HttpStatus.NOT_FOUND);
	    log.error(e.getMessage());
		return new  ResponseEntity<ApiErrors>(error,HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(ArithmeticException.class)
  public ResponseEntity<String> ArithmathicException(ArithmeticException e)
  {
	log.error(e.getMessage());
	return new  ResponseEntity<String>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR) ;
	  
  }
}

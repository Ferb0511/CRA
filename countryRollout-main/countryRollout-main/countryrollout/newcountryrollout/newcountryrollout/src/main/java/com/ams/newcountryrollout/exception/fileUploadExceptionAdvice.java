package com.ams.newcountryrollout.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.multipart.MaxUploadSizeExceededException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.ams.newcountryrollout.message.responseMessage;

@ControllerAdvice
public class fileUploadExceptionAdvice extends ResponseEntityExceptionHandler {
	 @ExceptionHandler(MaxUploadSizeExceededException.class)
	  public ResponseEntity<responseMessage> handleMaxSizeException(MaxUploadSizeExceededException exc) {
	    return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new responseMessage("File too large!"));
	  }

}

package com.proyecto.spring.zerotoheroapp.excepciones.manejador;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ManejoErrores {

    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<String> handlerArithmeticException(ArithmeticException ERROR) {
        return new ResponseEntity<>("Error: Division entre cero no permitida",HttpStatus.BAD_REQUEST);
    }
}

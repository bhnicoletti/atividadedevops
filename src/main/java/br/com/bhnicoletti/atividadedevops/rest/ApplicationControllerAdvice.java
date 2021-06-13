package br.com.bhnicoletti.atividadedevops.rest;

import br.com.bhnicoletti.atividadedevops.domain.exception.EntidadeNaoEncontradaException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApplicationControllerAdvice {

    @ExceptionHandler(EntidadeNaoEncontradaException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ApiErrors handleEntidadeNaoEncontradaException( EntidadeNaoEncontradaException ex){
        String msg = ex.getMessage();
        return new ApiErrors(msg);
    }
}

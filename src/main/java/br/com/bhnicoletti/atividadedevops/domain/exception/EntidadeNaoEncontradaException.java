package br.com.bhnicoletti.atividadedevops.domain.exception;


public class EntidadeNaoEncontradaException extends RuntimeException {
    public EntidadeNaoEncontradaException(String message) {
        super(message);
    }
}

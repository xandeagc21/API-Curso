package com.curso.api.APICurso.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class AlunosNotFoundException extends Exception {

    public AlunosNotFoundException(Long id) {
        super("Pessoa not found with ID " + id);
    }
}

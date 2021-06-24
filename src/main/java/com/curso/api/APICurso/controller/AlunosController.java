package com.curso.api.APICurso.controller;


import com.curso.api.APICurso.models.Alunos;
import com.curso.api.APICurso.models.response.MessageResponseModels;
import com.curso.api.APICurso.service.AlunosService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/aluno")
public class AlunosController {



    private AlunosService alunosService;

    @Autowired
    public AlunosController(AlunosService alunosService) {
        this.alunosService = alunosService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseModels criarAlunos(@RequestBody Alunos alunos){
        return  alunosService.criarAlunos(alunos);

    }


}

package com.curso.api.APICurso.controller;


import com.curso.api.APICurso.entity.Alunos;
import com.curso.api.APICurso.dto.response.MessageResponseModels;
import com.curso.api.APICurso.repository.AlunoRepository;
import com.curso.api.APICurso.service.AlunosService;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController@AllArgsConstructor
@RequestMapping("/aluno")
public class AlunosController {

    private AlunoRepository alunoRepository;

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
    @GetMapping
    public List<AlunosDTO> listAll() {
        return alunosService.listAll();
    }

}




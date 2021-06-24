package com.curso.api.APICurso.controller;


import com.curso.api.APICurso.models.Alunos;
import com.curso.api.APICurso.repository.AlunoRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/aluno")
public class AlunosController {

       private AlunoRepository alunoRepository;

        @GetMapping
        public List<Alunos> listAll(){
            return alunoRepository.findAll();
        }

        @GetMapping("/{id}")
        public Optional<Alunos> getAlunosId(@PathVariable Long id){
            return alunoRepository.findById(id);

        }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Alunos salvarAlunos(@RequestBody Alunos alunos){
            return alunoRepository.save(alunos);
    }
    @PutMapping("/{id}")
    public List<Alunos> updateAluno(@PathVariable Long id, @RequestBody Alunos alunos){
            return (List<Alunos>) alunoRepository.save(alunos);
    }

    @DeleteMapping ("/{id}")
    public void deletAluno(@PathVariable Long id){
            alunoRepository.deleteById(id);
    }

}

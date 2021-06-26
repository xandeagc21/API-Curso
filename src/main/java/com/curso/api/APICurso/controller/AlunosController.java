package com.curso.api.APICurso.controller;


import com.curso.api.APICurso.dto.request.AlunosDTO;
import com.curso.api.APICurso.dto.response.MessageResponseDTO;
import com.curso.api.APICurso.exception.AlunosNotFoundException;
import com.curso.api.APICurso.service.AlunosService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@AllArgsConstructor
@RestController
@RequestMapping("/aluno")
public class AlunosController {

    private  AlunosService alunosService;


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO criarAluno (@RequestBody  AlunosDTO alunosDTO){
        return  alunosService.criarAlunos(alunosDTO);
    }

    @GetMapping
    public List<AlunosDTO> listaTodos(){
        return alunosService.listaTodos();
    }

    @GetMapping("/{id}")
    public AlunosDTO buscaId(@PathVariable Long id) throws AlunosNotFoundException {
        return alunosService.buscarId(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletaId(@PathVariable Long id) throws AlunosNotFoundException {
        alunosService.delete(id);
    }


    @PutMapping("/{id}")
    public MessageResponseDTO atualizaPorId (@PathVariable Long id, @RequestBody AlunosDTO alunosDTO)
            throws AlunosNotFoundException{
        return alunosService.atualizaPorId(id ,alunosDTO);
    }

}




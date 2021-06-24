package com.curso.api.APICurso.service;

import com.curso.api.APICurso.models.Alunos;
import com.curso.api.APICurso.models.response.MessageResponseModels;
import com.curso.api.APICurso.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AlunosService {


    private AlunoRepository alunoRepository;

    @Autowired
    public AlunosService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public MessageResponseModels criarAlunos(Alunos alunos){
        Alunos savedAlunos = alunoRepository.save(alunos);
        return MessageResponseModels
                .builder()
                .message("Created aluno with ID"+ savedAlunos.getId())
                .build();
    }
}

package com.curso.api.APICurso.service;

import com.curso.api.APICurso.entity.Alunos;
import com.curso.api.APICurso.dto.response.MessageResponseModels;
import com.curso.api.APICurso.mapper.AlunosMapper;
import com.curso.api.APICurso.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AlunosService {


    private AlunoRepository alunoRepository;

   /* private final AlunosMapper personMapper = AlunosMapper.INSTANCE;*/

    @Autowired
    public AlunosService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public MessageResponseModels criarAlunos(Alunos alunos) {
        Alunos savedAlunos = alunoRepository.save(alunos);
        return MessageResponseModels
                .builder()
                .message(" aluno cadastrado com sucesso com ID " + savedAlunos.getId())
                .build();
    }

    public List<AlunosDto> listAll() {
        List<Alunos> allPeople = alunoRepository.findAll();
        return allPeople.stream()
                .map(personMapper::toDTO)
                .collect(Collectors.toList());



}


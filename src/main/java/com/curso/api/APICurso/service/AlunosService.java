package com.curso.api.APICurso.service;

import com.curso.api.APICurso.dto.request.AlunosDTO;
import com.curso.api.APICurso.dto.response.MessageResponseDTO;
import com.curso.api.APICurso.entity.Alunos;
import com.curso.api.APICurso.exception.AlunosNotFoundException;
import com.curso.api.APICurso.mapper.AlunosMapper;
import com.curso.api.APICurso.repository.AlunoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@AllArgsConstructor

public class AlunosService {


    private AlunoRepository alunoRepository;

    private final AlunosMapper alunosMapper = AlunosMapper.INSTANCE;

    public MessageResponseDTO criarAlunos(AlunosDTO alunosDTO) {

        Alunos salvarToAluno = alunosMapper.toModel(alunosDTO);



        Alunos alunoSalvar = alunoRepository.save(salvarToAluno);



        return criarMessageResponse(alunoSalvar.getId(), "Aluno cadastrado com sucesso com ID");

    }

    public List<AlunosDTO> listaTodos() {
        List<Alunos> todosAlunos = alunoRepository.findAll();
        return todosAlunos.stream()
                .map(alunosMapper::toDTO)
                .collect(Collectors.toList());
    }
    public AlunosDTO buscarId(Long id) throws AlunosNotFoundException {
        Alunos alunos = verifaSeExiste(id);

        return  alunosMapper.toDTO(alunos);
    }

    public MessageResponseDTO atualizaPorId(Long id, AlunosDTO alunosDTO) throws AlunosNotFoundException{

        verifaSeExiste(id);

        Alunos atualizaAluno = alunosMapper.toModel(alunosDTO);

        Alunos alunoAtualiza = alunoRepository.save(atualizaAluno);
        return criarMessageResponse(alunoAtualiza.getId(),"Cadastro atualizado com Sucesso");
    }

    public void delete(Long id) throws AlunosNotFoundException {
        verifaSeExiste(id);
        alunoRepository.deleteById(id);
    }


    private Alunos verifaSeExiste(Long id) throws AlunosNotFoundException {
        return alunoRepository.findById(id)
                .orElseThrow(() -> new AlunosNotFoundException(id));
    }
    private MessageResponseDTO criarMessageResponse(Long id, String message) {
        return MessageResponseDTO
                .builder()
                .message(message + id)
                .build();
    }



}

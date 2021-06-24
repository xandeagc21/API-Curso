package com.curso.api.APICurso.repository;

import com.curso.api.APICurso.models.Alunos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Alunos, Long> {
}

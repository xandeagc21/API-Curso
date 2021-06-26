package com.curso.api.APICurso;

import com.curso.api.APICurso.entity.Alunos;
import com.curso.api.APICurso.repository.AlunoRepository;
import com.curso.api.APICurso.service.AlunosService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class ApiCursoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiCursoApplication.class, args);
	}


}

package com.curso.api.APICurso.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Alunos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String sobreNome;

    private LocalDate dataNascimento;

    @Column(nullable = false,unique = true)
    private String email;

    @Column(nullable = false)
    private String curso;

    @Column(nullable = false)
    private int nota1;

    @Column(nullable = false)
    private int nota2;

    private int media=nota1+nota2 /2;


}

package com.curso.api.APICurso.entity;


import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
public class Alunos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String sobreNome;

    @Column(nullable = false,unique = true)
    private String email;

    @Column(nullable = false)
    private String curso;

    @Column(nullable = false)
    private int nota;


}

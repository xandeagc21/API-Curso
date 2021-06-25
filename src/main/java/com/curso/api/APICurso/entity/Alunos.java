package com.curso.api.APICurso.models;


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

    @Column(nullable = false, length = 50)
    private String nome;

    @Column(nullable = false, length = 30)
    private String sobreNome;

    @Column(nullable = false, length = 30,unique = true)
    private String email;

    @Column(nullable = false, length = 50)
    private String curso;


    @Column( length = 4)
    private int nota;




}

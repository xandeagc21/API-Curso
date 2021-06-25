package com.curso.api.APICurso.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AlunoDTO {

    private Long id;

    @NotEmpty
    @Size(min = 2, max = 100)
    private String nome;

    @NotEmpty
    @Size(min = 2, max = 100)
    private String sobreNome;

    @NotEmpty
    @Size(min = 2, max = 100)
    private String email;

    @NotEmpty
    @Size(min = 2, max = 100)
    private String curso;

    @NotEmpty
    @Size(min = 2, max = 3)
    private int nota;
}
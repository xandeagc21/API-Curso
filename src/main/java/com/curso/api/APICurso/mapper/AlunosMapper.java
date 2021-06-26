package com.curso.api.APICurso.mapper;


import org.mapstruct.Mapper;

@Mapper
public interface AlunosMapper {

   AlunosMapper INSTANCE = Mappers.getMapper( AlunosMapper.class );


    @Mapping(source = "numberOfSeats", target = "seatCount")
    AlunosDto alunosdto(Alunos alunos);

    Alunos toDTO(Alunos alunos);

    class AlunosDto {
    }
}

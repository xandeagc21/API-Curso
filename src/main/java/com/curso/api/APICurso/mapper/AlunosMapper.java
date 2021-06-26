package com.curso.api.APICurso.mapper;


import com.curso.api.APICurso.dto.request.AlunosDTO;
import com.curso.api.APICurso.entity.Alunos;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AlunosMapper {

   AlunosMapper INSTANCE = Mappers.getMapper( AlunosMapper.class );


    @Mapping(target = "dataNascimento", source = "dataNascimento", dateFormat = "dd-MM-yyyy")
    Alunos toModel(AlunosDTO alunosDTO);

    AlunosDTO toDTO(Alunos alunos);


}

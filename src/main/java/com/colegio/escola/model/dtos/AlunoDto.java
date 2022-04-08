package com.colegio.escola.model.dtos;

import lombok.Data;

@Data
public class AlunoDto {
    private Long id;
    private String nome;

    public AlunoDto(Long id, String nome){
        this.id = id;
        this.nome = nome;
    }

    public AlunoDto(){}
}

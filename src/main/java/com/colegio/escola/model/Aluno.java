package com.colegio.escola.model;

import com.colegio.escola.model.dtos.AlunoDto;
import lombok.Data;

@Data
public class Aluno {
    private Long id;
    private String nome;

    public Aluno (Long id, String nome){
        this.id = id;
        this.nome = nome;
    }

    public Aluno(AlunoDto alunoDto){
        this.id = alunoDto.getId();
        this.nome = alunoDto.getNome();
    }

    public AlunoDto toAlunoDto(){
        AlunoDto alunoDto = new AlunoDto();
        alunoDto.setId(this.id);
        alunoDto.setNome(this.nome);
        return alunoDto;
    }
}

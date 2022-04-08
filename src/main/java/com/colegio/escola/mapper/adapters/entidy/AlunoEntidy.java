package com.colegio.escola.mapper.adapters.entidy;

import com.colegio.escola.model.Aluno;

import javax.persistence.*;

@Entity
@Table(name="aluno")
public class AlunoEntidy {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;

    public AlunoEntidy(){}

    public AlunoEntidy(Long id, String nome){
        this.id = id;
        this.nome = nome;
    }

    public Aluno toAluno(){
        Aluno aluno = new Aluno(this.id, this.nome);
        return aluno;
    }
}

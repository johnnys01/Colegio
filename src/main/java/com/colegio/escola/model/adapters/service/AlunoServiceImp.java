package com.colegio.escola.model.adapters.service;

import com.colegio.escola.model.Aluno;
import com.colegio.escola.model.dtos.AlunoDto;
import com.colegio.escola.model.ports.interfaces.AlunoServicePort;
import com.colegio.escola.model.ports.repositorys.AlunoRepositoryPort;

import java.util.List;
import java.util.stream.Collectors;

public class AlunoServiceImp implements AlunoServicePort {

    private final AlunoRepositoryPort alunoRepositoryPort;

    public AlunoServiceImp(AlunoRepositoryPort alunoRepositoryPort) {
        this.alunoRepositoryPort = alunoRepositoryPort;
    }

    @Override
    public List<AlunoDto> buscarAlunos() {
        List<Aluno> alunos = this.alunoRepositoryPort.buscarAlunos();
        List<AlunoDto> alunosDto = alunos.stream().map(Aluno::toAlunoDto).collect(Collectors.toList());
        return alunosDto;
    }
}

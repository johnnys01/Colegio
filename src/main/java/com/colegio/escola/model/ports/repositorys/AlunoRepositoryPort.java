package com.colegio.escola.model.ports.repositorys;

import com.colegio.escola.model.Aluno;

import java.util.List;

public interface AlunoRepositoryPort {

    List<Aluno> buscarAlunos();
}

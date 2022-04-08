package com.colegio.escola.mapper.adapters.repository;

import com.colegio.escola.mapper.adapters.entidy.AlunoEntidy;
import com.colegio.escola.model.Aluno;
import com.colegio.escola.model.ports.repositorys.AlunoRepositoryPort;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class AlunoRepository implements AlunoRepositoryPort {

    private final StringAlunoRepository stringAlunoRepository;

    public AlunoRepository(StringAlunoRepository stringAlunoRepository) {
        this.stringAlunoRepository = stringAlunoRepository;
    }

    @Override
    public List<Aluno> buscarAlunos() {
        List<AlunoEntidy> alunoEntidies = stringAlunoRepository.findAll();
        return alunoEntidies.stream().map(AlunoEntidy::toAluno).collect(Collectors.toList());
    }
}

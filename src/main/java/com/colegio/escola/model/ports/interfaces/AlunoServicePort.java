package com.colegio.escola.model.ports.interfaces;

import com.colegio.escola.model.dtos.AlunoDto;

import java.util.List;

public interface AlunoServicePort {

    List<AlunoDto> buscarAlunos();
}

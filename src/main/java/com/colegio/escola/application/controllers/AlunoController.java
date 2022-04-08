package com.colegio.escola.application.controllers;

import com.colegio.escola.model.dtos.AlunoDto;
import com.colegio.escola.model.ports.interfaces.AlunoServicePort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("aluno")
public class AlunoController {

    private final AlunoServicePort alunoServicePort;

    public AlunoController(AlunoServicePort alunoServicePort) {
        this.alunoServicePort = alunoServicePort;
    }

    @GetMapping("")
    public List<AlunoDto> getAlunos(){
        List<AlunoDto> alunoDtos = alunoServicePort.buscarAlunos();
        return alunoDtos;
    }
}

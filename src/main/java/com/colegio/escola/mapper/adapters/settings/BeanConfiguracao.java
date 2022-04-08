package com.colegio.escola.mapper.adapters.settings;

import com.colegio.escola.model.adapters.service.AlunoServiceImp;
import com.colegio.escola.model.ports.interfaces.AlunoServicePort;
import com.colegio.escola.model.ports.repositorys.AlunoRepositoryPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguracao {

    @Bean
    AlunoServicePort alunoService(AlunoRepositoryPort alunoRepositoryPort){
        return new AlunoServiceImp(alunoRepositoryPort);
    }
}

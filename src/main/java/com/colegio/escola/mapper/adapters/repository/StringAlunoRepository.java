package com.colegio.escola.mapper.adapters.repository;

import com.colegio.escola.mapper.adapters.entidy.AlunoEntidy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StringAlunoRepository extends JpaRepository<AlunoEntidy, Long> {
}

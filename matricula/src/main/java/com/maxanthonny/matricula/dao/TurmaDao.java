package com.maxanthonny.matricula.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maxanthonny.matricula.entidade.Turma;

@Repository
public interface TurmaDao extends JpaRepository<Turma, Long>{

}
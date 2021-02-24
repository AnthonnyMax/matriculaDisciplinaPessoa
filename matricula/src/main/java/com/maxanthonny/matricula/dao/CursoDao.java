package com.maxanthonny.matricula.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maxanthonny.matricula.entidade.Curso;

@Repository
public interface CursoDao extends JpaRepository<Curso, Long>{

}

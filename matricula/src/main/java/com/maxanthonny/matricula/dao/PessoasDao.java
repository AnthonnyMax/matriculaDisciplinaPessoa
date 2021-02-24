package com.maxanthonny.matricula.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maxanthonny.matricula.entidade.Pessoas;

@Repository
public interface PessoasDao extends JpaRepository<Pessoas, Long>{

}
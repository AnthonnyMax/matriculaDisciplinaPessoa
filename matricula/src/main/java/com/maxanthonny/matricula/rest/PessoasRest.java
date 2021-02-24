package com.maxanthonny.matricula.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maxanthonny.matricula.dao.PessoasDao;
import com.maxanthonny.matricula.entidade.Pessoas;


@RestController
@RequestMapping("/pessoas")
public class PessoasRest {

	@Autowired
	private PessoasDao pessoasDao;
	
	@GetMapping
	public List<Pessoas> get(){
		return pessoasDao.findAll();
	}
	
	@PostMapping
	public void post(@RequestBody Pessoas pessoas) {
		pessoasDao.save(pessoas);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		pessoasDao.deleteById(id);
	}
}


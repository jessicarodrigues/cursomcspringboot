package com.jessica.cursomc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jessica.cursomc.domain.Categoria;
import com.jessica.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;

	public Categoria buscar(Integer id) {
		Categoria obj = repo.findOne(id);
		return obj;
	}
	
}
